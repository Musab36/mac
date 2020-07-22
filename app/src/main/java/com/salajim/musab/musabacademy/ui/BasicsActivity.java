package com.salajim.musab.musabacademy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.salajim.musab.musabacademy.R;
import com.salajim.musab.musabacademy.adapter.LessonsAdapter;
import com.salajim.musab.musabacademy.model.Lessons;

import java.util.ArrayList;
import java.util.List;

public class BasicsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<String> titlesArray;
    LessonsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        lessonsData();
        setAdapter();
    }

    private void setAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new LessonsAdapter(getApplicationContext(), titlesArray);
        recyclerView.setAdapter(adapter);
    }

    private void lessonsData() {
        titlesArray = new ArrayList<>();
        titlesArray.add("CASHARKA 1");
        titlesArray.add("CASHARKA 2");
        titlesArray.add("CASHARKA 3");
        titlesArray.add("CASHARKA 4");
        titlesArray.add("CASHARKA 5");
        titlesArray.add("CASHARKA 6");
        titlesArray.add("CASHARKA 7");
        titlesArray.add("CASHARKA 8");
        titlesArray.add("CASHARKA 9");
        titlesArray.add("CASHARKA 10");
        titlesArray.add("CASHARKA 11");
        titlesArray.add("CASHARKA 12");
        titlesArray.add("CASHARKA 13");
    }

}