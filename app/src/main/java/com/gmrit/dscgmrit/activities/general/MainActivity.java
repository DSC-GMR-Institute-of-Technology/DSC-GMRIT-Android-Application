package com.gmrit.dscgmrit.activities.general;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.activities.events.EventsDisplayActivity;
import com.gmrit.dscgmrit.activities.team.TeamDisplayActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout eventsLayout, cardabout, faqs,ideas, community,cardTeam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventsLayout = findViewById(R.id.cardEvents);
        cardabout = findViewById(R.id.cardAbout);
        faqs = findViewById(R.id.cardFAQs);
        ideas = findViewById(R.id.cardIdeas);
        community = findViewById(R.id.cardCommunity);
        cardTeam = findViewById(R.id.cardTeam);

        cardTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TeamDisplayActivity.class);
                startActivity(intent);

            }
        });

        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CommunityRegistrationActivity.class);
                startActivity(intent);
            }
        });

        ideas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IdeaSpotActivity.class);
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
                Intent intent = new Intent(MainActivity.this, EventsDisplayActivity.class);
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