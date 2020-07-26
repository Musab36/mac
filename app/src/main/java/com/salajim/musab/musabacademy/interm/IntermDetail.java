package com.salajim.musab.musabacademy.interm;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import com.salajim.musab.musabacademy.R;

public class IntermDetail extends AppCompatActivity {
    String title = "";
    String vid = "";
    VideoView videoV;
    TextView bartext;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interm_detail);


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

        progressBar = findViewById(R.id.progressbar);
        progressBar.setVisibility(View.VISIBLE);

        loadVideo();

    }

    private void loadVideo() {
        videoV.setVideoURI(Uri.parse(vid));

        MediaController mediaController = new MediaController(this);
        videoV.setMediaController(mediaController);
        videoV.start();

        videoV.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
    }


}