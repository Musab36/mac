package com.salajim.musab.musabacademy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.salajim.musab.musabacademy.R;
import com.salajim.musab.musabacademy.adapter.SignalsAdapter;
import com.salajim.musab.musabacademy.model.Signals;

import java.util.ArrayList;

public class SignalsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressBar progressBar;
    private ArrayList<Signals> signalsList = new ArrayList<>();
    private SignalsAdapter mAdapter;

    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signals);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView = findViewById(R.id.signalsRecycler);
        progressBar = findViewById(R.id.progressbar);

        // Retrieving data from firebase database
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("signals");

        progressBar.setVisibility(View.VISIBLE);

        displayData();

    }

    // Retrieving data from firebase
    private void displayData() {

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    signalsList.add(ds.getValue(Signals.class));
                }

                if (signalsList.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "No Signals", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.INVISIBLE);
                } else {
                    mAdapter = new SignalsAdapter(getApplicationContext(), signalsList);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(mAdapter);

                    progressBar.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    // inflating the menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_add, menu);

        return super.onCreateOptionsMenu(menu);
    }

    // menu action
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_add) {
            Intent intent = new Intent(this, SignalsAdminActivity.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}