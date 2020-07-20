package com.salajim.musab.musabacademy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.salajim.musab.musabacademy.R;

public class LessonsActivity extends AppCompatActivity implements View.OnClickListener{
    CardView basicsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        basicsCard = (CardView) findViewById(R.id.card1);

        basicsCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == basicsCard) {
            Intent intent = new Intent(this, BasicsActivity.class);
            startActivity(intent);
        }
    }
}