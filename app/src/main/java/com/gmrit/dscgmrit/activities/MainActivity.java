package com.gmrit.dscgmrit.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.gmrit.dscgmrit.Community_reg;
import com.gmrit.dscgmrit.IdeaSpot;
import com.gmrit.dscgmrit.R;

public class MainActivity extends AppCompatActivity {

    LinearLayout eventsLayout, cardabout, faqs,ideas, community;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventsLayout = findViewById(R.id.cardEvents);
        cardabout = findViewById(R.id.cardAbout);
        faqs = findViewById(R.id.cardFAQs);
        ideas = findViewById(R.id.cardIdeas);
        community = findViewById(R.id.cardCommunity);

        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Community_reg.class);
                startActivity(intent);
            }
        });

        ideas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IdeaSpot.class);
                startActivity(intent);
            }
        });

        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FAQPage.class);
                startActivity(intent);
            }
        });

        eventsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(intent);
            }
        });

        cardabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutPage.class);
                startActivity(intent);

            }
        });
    }
}