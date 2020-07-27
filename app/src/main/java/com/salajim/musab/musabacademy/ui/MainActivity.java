package com.salajim.musab.musabacademy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.salajim.musab.musabacademy.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView lessonsCard;
    CardView signalsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lessonsCard = findViewById(R.id.card1);
        signalsCard = findViewById(R.id.card2);

        lessonsCard.setOnClickListener(this);
        signalsCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == lessonsCard) {
            Intent intent = new Intent(this, LessonsActivity.class);
            startActivity(intent);
        }

        if (v == signalsCard) {
            Intent intent = new Intent(this, SignalsActivity.class);
            startActivity(intent);
        }
    }
}