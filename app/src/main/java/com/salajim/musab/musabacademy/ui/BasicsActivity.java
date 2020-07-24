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

        // Adding videos from firebase storage to the arrayList
        videosArray = new ArrayList<>();
        String v1 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq1.mp4?alt=media&token=4c08c1cd-c00e-43ba-833c-16f7aa3bf6c3";
        videosArray.add(v1);
        String v2 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq2.mp4?alt=media&token=878046a6-b118-4c1c-8f7a-d350be0ebb70";
        videosArray.add(v2);
        String v3 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq3.mp4?alt=media&token=23373f11-9ce7-4081-b8a4-8c9c0a677cc2";
        videosArray.add(v3);
        String v4 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq3.mp4?alt=media&token=23373f11-9ce7-4081-b8a4-8c9c0a677cc2";
        videosArray.add(v4);
        String v5 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq5.mp4?alt=media&token=6b8f9805-934a-465b-bd79-6514847fe344";
        videosArray.add(v5);
        String v6 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq6.mp4?alt=media&token=3f566d7b-9ce1-47d5-be0f-b8bfa977252c";
        videosArray.add(v6);
        String v7 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq7.mp4?alt=media&token=219fb912-bf7f-4959-8e7f-e6eb484df804";
        videosArray.add(v7);
        String v8 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq8.mp4?alt=media&token=0a816976-fcee-4b13-a510-26d555f6361c";
        videosArray.add(v8);
        String v9 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq9.mp4?alt=media&token=bf54cee1-3b20-47d0-b082-58f0ce374d23";
        videosArray.add(v9);
        String v10 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq10.mp4?alt=media&token=6efa34f1-9c1e-4918-ab84-04517146c75a";
        videosArray.add(v10);
        String v11 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq11.mp4?alt=media&token=ecc89b1b-b3fb-4876-be5e-f6d11a363082";
        videosArray.add(v11);
        String v12 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq12.mp4?alt=media&token=603ef9b5-eec8-4c85-b90a-163bd124458a";
        videosArray.add(v12);
        String v13 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/aq13.mp4?alt=media&token=d88a725d-8cf8-4c64-a8ed-0611720dce37";
        videosArray.add(v13);

          /*
        String v13 = "android.resource://" + getPackageName() + "/" + R.raw.aq13;
        videosArray.add(v13);
        */
    }

}