package com.gmrit.dscgmrit.activities.general;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.gmrit.dscgmrit.R;

public class IdeaSpotActivity extends AppCompatActivity {

    ImageView back, ideaSpotImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea_spot);
        back = findViewById(R.id.ideaSpotBackButton);
        ideaSpotImage = findViewById(R.id.ideaSpotImage);

        Glide.with(this).load(R.drawable.ideas_stock).into(ideaSpotImage);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}