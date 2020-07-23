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
    ArrayList<String> videosArray;

    LessonsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);

        recyclerView = findViewById(R.id.recyclerview);

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
        adapter = new LessonsAdapter(getApplicationContext(), titlesArray, videosArray);
        recyclerView.setAdapter(adapter);
    }

    private void lessonsData() {
        // Adding video titles to the arrayList
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

        // Adding videos to the arrayList
        videosArray = new ArrayList<>();
        String v1 = "android.resource://" + getPackageName() + "/" + R.raw.aq1;
        videosArray.add(v1);
        String v2 = "android.resource://" + getPackageName() + "/" + R.raw.aq2;
        videosArray.add(v2);
        String v3 = "android.resource://" + getPackageName() + "/" + R.raw.aq3;
        videosArray.add(v3);
        String v4 = "android.resource://" + getPackageName() + "/" + R.raw.aq4;
        videosArray.add(v4);
        String v5 = "android.resource://" + getPackageName() + "/" + R.raw.aq5;
        videosArray.add(v5);
        String v6 = "android.resource://" + getPackageName() + "/" + R.raw.aq6;
        videosArray.add(v6);
        String v7 = "android.resource://" + getPackageName() + "/" + R.raw.aq7;
        videosArray.add(v7);
        String v8 = "android.resource://" + getPackageName() + "/" + R.raw.aq8;
        videosArray.add(v8);
        String v9 = "android.resource://" + getPackageName() + "/" + R.raw.aq9;
        videosArray.add(v9);
        String v10 = "android.resource://" + getPackageName() + "/" + R.raw.aq10;
        videosArray.add(v10);
        String v11 = "android.resource://" + getPackageName() + "/" + R.raw.aq11;
        videosArray.add(v11);
        String v12 = "android.resource://" + getPackageName() + "/" + R.raw.aq12;
        videosArray.add(v12);
        String v13 = "android.resource://" + getPackageName() + "/" + R.raw.aq13;
        videosArray.add(v13);
    }

}