package com.gmrit.dscgmrit.activities.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
                Intent intent = new Intent(EventDetailsActivity.this, EventsDisplayActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        btnEventRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(EventDetailsActivity.this, EventRegistrationActivity.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("eventName", eventName);
                intent.putExtras(bundle1);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });


    }
}