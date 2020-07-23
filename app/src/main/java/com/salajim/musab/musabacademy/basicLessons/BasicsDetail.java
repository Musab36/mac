package com.salajim.musab.musabacademy.basicLessons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.salajim.musab.musabacademy.R;

public class BasicsDetail extends AppCompatActivity {
    String title = "";
    String vid = "";
    VideoView videoV;
    TextView bartext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basics_detail);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        vid = intent.getStringExtra("video");

        videoV = findViewById(R.id.videoView);
        bartext = findViewById(R.id.barText);
        bartext.setText(title);

        videoV.setVideoURI(Uri.parse(vid));

        MediaController mediaController = new MediaController(this);
        videoV.setMediaController(mediaController);
        videoV.start();
    }
}