package com.gmrit.dscgmrit.activities.events;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.gmrit.dscgmrit.R;

import org.w3c.dom.Text;

public class EventRegistrationActivity extends AppCompatActivity {

    TextView selectedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_registration);

        selectedText = findViewById(R.id.selectedText);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String eventName = bundle.getString("eventName");

        selectedText.setText("Selected Event: " + eventName);




    }
}