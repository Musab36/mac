package com.salajim.musab.musabacademy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.salajim.musab.musabacademy.R;
import com.salajim.musab.musabacademy.adapter.AdvanceAdapter;
import com.salajim.musab.musabacademy.adapter.IntermediateAdapter;

import java.util.ArrayList;

public class AdvanceActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<String> titlesArray;
    ArrayList<String> videosArray;

    AdvanceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);

        recyclerView = findViewById(R.id.recyclerview);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        lessonData();
        adapterSetup();

    }

    private void adapterSetup() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdvanceAdapter(getApplicationContext(), titlesArray, videosArray);
        recyclerView.setAdapter(adapter);
    }

    private void lessonData() {
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
        titlesArray.add("ZOOM 1");
        titlesArray.add("ZOOM 2");
        titlesArray.add("ZOOM 3");

        // Adding videos from firebase storage to the arrayList
        videosArray = new ArrayList<>();
        String v1 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts1.mp4?alt=media&token=b996b0b2-9f3c-4424-bd31-ac94cb867774";
        videosArray.add(v1);
        String v2 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts2.mp4?alt=media&token=1ffdfc03-35ca-4379-a463-ba678894072c";
        videosArray.add(v2);
        String v3 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts3.mp4?alt=media&token=31535ffa-aac0-4a4e-94ae-6c9968d6886f";
        videosArray.add(v3);
        String v4 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts4.mp4?alt=media&token=a8f5a7c7-ccc0-48d2-983f-95acc00aaa9c";
        videosArray.add(v4);
        String v5 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts5.mp4?alt=media&token=2a2dcd23-edb0-4062-a04f-29aa440575e6";
        videosArray.add(v5);
        String v6 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts6.mp4?alt=media&token=c6297140-2828-4830-af9d-6acfde4c18bc";
        videosArray.add(v6);
        String v7 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts7.mp4?alt=media&token=12578b46-fb44-42c8-a79d-eee4ddfaa8a1";
        videosArray.add(v7);
        String v8 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts8.mp4?alt=media&token=71d5b5a8-9142-4b97-9262-6dc26e4a76e3";
        videosArray.add(v8);
        String v9 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts9.mp4?alt=media&token=81f4fad0-deb9-4222-93b8-4713f27536ba";
        videosArray.add(v9);
        String v10 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts10.mp4?alt=media&token=509c9615-5664-4cab-ba07-b15be3d7ada0";
        videosArray.add(v10);
        String v11 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts11.mp4?alt=media&token=c25c99f5-233f-4213-87a1-a54d6c10d660";
        videosArray.add(v11);
        String v12 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/ts12.mp4?alt=media&token=4161aafc-b3c7-4bca-9ec7-10341c58b891";
        videosArray.add(v12);
        String v13 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/zoom1.mp4?alt=media&token=fefb010c-7305-4e27-b187-70239e56c0b1";
        videosArray.add(v13);
        String v14 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/zoom2.mp4?alt=media&token=73943c6d-c397-4dbd-a4b1-e0ef56482288";
        videosArray.add(v14);
        String v15 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/zoom3.mp4?alt=media&token=0748c830-a8da-4f05-9a8f-c86fdce4691b";
        videosArray.add(v15);
    }

}