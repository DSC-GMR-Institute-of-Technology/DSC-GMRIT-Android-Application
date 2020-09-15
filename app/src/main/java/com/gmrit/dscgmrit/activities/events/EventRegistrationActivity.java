package com.gmrit.dscgmrit.activities.events;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.gmrit.dscgmrit.R;

import org.w3c.dom.Text;

public class EventRegistrationActivity extends AppCompatActivity {

    TextView selectedText;
    ImageView backButton, eventRegistrationImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_registration);

        selectedText = findViewById(R.id.selectedText);
        backButton = findViewById(R.id.eventRegistrationBackButton);
        eventRegistrationImage = findViewById(R.id.eventRegistrationImage);

        Glide.with(this).load(R.drawable.event).into(eventRegistrationImage);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String eventName = bundle.getString("eventName");

        selectedText.setText("Selected Event: " + eventName);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}