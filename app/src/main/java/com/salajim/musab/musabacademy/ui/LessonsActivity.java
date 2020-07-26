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
    CardView intermediateCard;
    CardView advanceCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        basicsCard = findViewById(R.id.card1);
        intermediateCard = findViewById(R.id.card2);
        advanceCard = findViewById(R.id.card3);

        basicsCard.setOnClickListener(this);
        intermediateCard.setOnClickListener(this);
        advanceCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == basicsCard) {
            Intent intent = new Intent(this, BasicsActivity.class);
            startActivity(intent);
        }

        if (v == intermediateCard) {
            Intent intent = new Intent(this, IntermediateActivity.class);
            startActivity(intent);
        }

        if (v == advanceCard) {
            Intent intent = new Intent(this, AdvanceActivity.class);
            startActivity(intent);
        }

    }
}