package com.salajim.musab.musabacademy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.salajim.musab.musabacademy.R;

public class SignalsAdminActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signals_admin);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        username = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submitBtn);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == submit) {
            getAdmin();
        }

    }

    private void getAdmin() {
        String user = username.getText().toString();
        int pass = Integer.parseInt(password.getText().toString());
        if (user != "Musab" && pass != 5474213) {
            Toast.makeText(this, "Incorrect password or usernam", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, AddSignalsActivity.class);
            startActivity(intent);
        }
    }
}