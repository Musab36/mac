package com.salajim.musab.musabacademy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.salajim.musab.musabacademy.R;
import com.salajim.musab.musabacademy.adapter.BasicsAdapter;
import com.salajim.musab.musabacademy.adapter.IntermediateAdapter;

import java.util.ArrayList;

public class IntermediateActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<String> titlesArray;
    ArrayList<String> videosArray;

    IntermediateAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);

        recyclerView = findViewById(R.id.recyclerview);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        lessonData();
        setAdapter();
    }

    private void setAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new IntermediateAdapter(getApplicationContext(), titlesArray, videosArray);
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
        titlesArray.add("CASHARKA 13");
        titlesArray.add("CASHARKA 14");
        titlesArray.add("CASHARKA 15");
        titlesArray.add("CASHARKA 16");
        titlesArray.add("CASHARKA 17");
        titlesArray.add("CASHARKA 18");

        // Adding videos from firebase storage to the arrayList
        videosArray = new ArrayList<>();
        String v1 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td1.mp4?alt=media&token=a64a4979-755f-45d7-98e8-94928af64fe2";
        videosArray.add(v1);
        String v2 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td2.mp4?alt=media&token=497d87e6-5032-4197-be50-0ebc5e916137";
        videosArray.add(v2);
        String v3 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td3.mp4?alt=media&token=a1deb42d-fa80-4675-9108-c09c11ee83f4";
        videosArray.add(v3);
        String v4 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td4.mp4?alt=media&token=b65e2dc0-6754-44ee-89fa-114cf482a98a";
        videosArray.add(v4);
        String v5 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td5.mp4?alt=media&token=b197d1f9-abb9-45ac-87e4-acf04987e7ca";
        videosArray.add(v5);
        String v6 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td6.mp4?alt=media&token=87588988-bd87-4992-87c5-7fce5789b733";
        videosArray.add(v6);
        String v7 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td7.mp4?alt=media&token=6e7d1c23-4c3a-4961-9483-f194bb8e8d47";
        videosArray.add(v7);
        String v8 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td8.mp4?alt=media&token=b54a90cf-ccba-4a88-acc9-43853c9c86f3";
        videosArray.add(v8);
        String v9 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td9.mp4?alt=media&token=247292fa-6c87-4e22-9e66-5e62f5f20af9";
        videosArray.add(v9);
        String v10 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td10.mp4?alt=media&token=89324bfb-dd90-4450-96e5-448a782b226b";
        videosArray.add(v10);
        String v11 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td11.mp4?alt=media&token=a3870877-1a8c-4bee-8db7-c7502ae615be";
        videosArray.add(v11);
        String v12 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td12.mp4?alt=media&token=95d4bb80-039a-4cc7-bc33-879a72766016";
        videosArray.add(v12);
        String v13 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td13.mp4?alt=media&token=3b914f71-083a-4fc3-a11a-fadeae069a14";
        videosArray.add(v13);
        String v14 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td14.mp4?alt=media&token=581da3dd-335a-47ac-9462-1f1ff3295762";
        videosArray.add(v14);
        String v15 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td15.mp4?alt=media&token=0e0ea2ce-29c9-4cdd-bc0e-91f01a3e73cc";
        videosArray.add(v15);
        String v16 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td16.mp4?alt=media&token=6349fabb-9f79-4bd0-9b6f-c3cb9a55bff8";
        videosArray.add(v16);
        String v17 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td17.mp4?alt=media&token=2c132e8c-ea9f-4b9c-843b-ef53655ba923";
        videosArray.add(v17);
        String v18 = "https://firebasestorage.googleapis.com/v0/b/musabacademy9.appspot.com/o/td18.mp4?alt=media&token=23114f7b-d99a-4abc-9852-68a08470f649";
        videosArray.add(v18);
    }


}