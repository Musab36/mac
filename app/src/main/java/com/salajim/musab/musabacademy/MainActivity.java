package com.salajim.musab.musabacademy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView lessonsCard;
    CardView signalsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lessonsCard = (CardView) findViewById(R.id.card1);
        signalsCard = (CardView) findViewById(R.id.card2);

        lessonsCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == lessonsCard) {
            Intent intent = new Intent(this, LessonsActivity.class);
            startActivity(intent);
        }
    }
}