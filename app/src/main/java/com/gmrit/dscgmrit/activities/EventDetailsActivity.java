package com.gmrit.dscgmrit.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gmrit.dscgmrit.R;

public class EventDetailsActivity extends AppCompatActivity {

    ImageView eventsImage, backButton;
    Button btnEventRegister;
    TextView txtEventName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        eventsImage = findViewById(R.id.eventImage);
        txtEventName = findViewById(R.id.txteventTitle);

        backButton = findViewById(R.id.back_button);
        btnEventRegister = findViewById(R.id.btnEventRegister);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String eventName = bundle.getString("eventName");
        int eventImage = bundle.getInt("eventImage");

        txtEventName.setText(eventName);
        eventsImage.setImageResource(eventImage);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventDetailsActivity.this, EventsActivity.class);
                startActivity(intent);
            }
        });

        btnEventRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EventDetailsActivity.this, "Event Registered Successfully !", Toast.LENGTH_SHORT).show();

            }
        });



    }
}