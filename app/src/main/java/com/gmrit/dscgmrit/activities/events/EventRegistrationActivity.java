package com.gmrit.dscgmrit.activities.events;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gmrit.dscgmrit.R;

import org.w3c.dom.Text;

public class EventRegistrationActivity extends AppCompatActivity {

    TextView selectedText;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_registration);

        selectedText = findViewById(R.id.selectedText);
        backButton = findViewById(R.id.eventRegistrationBackButton);

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