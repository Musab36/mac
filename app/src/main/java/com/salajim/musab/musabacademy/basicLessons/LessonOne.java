package com.salajim.musab.musabacademy.basicLessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.salajim.musab.musabacademy.R;

public class LessonOne extends AppCompatActivity {
    String title = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
    }
}