package com.gmrit.dscgmrit.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.adapters.EventsDisplayAdapter;
import com.gmrit.dscgmrit.modals.EventData;

import java.util.ArrayList;
import java.util.List;

public class EventsActivity extends AppCompatActivity {

    TextView txtUpcoming,txtCompleted;
    RecyclerView eventsList;
    EventsDisplayAdapter eventsDisplayAdapter;
    List<EventData> eventDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        txtUpcoming = findViewById(R.id.txtUpcoming);
        txtCompleted = findViewById(R.id.txtCompleted);

        eventDataList = new ArrayList<>();
        eventsList = findViewById(R.id.eventsList);

        txtCompleted.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                //highlighting Completed TextView
                txtCompleted.setTextColor(Color.WHITE);
                txtCompleted.setBackground(getDrawable(R.drawable.blue_bg_textview));

                // normalising Upcoming Text View
                txtUpcoming.setTextColor(Color.BLACK);
                txtUpcoming.setBackgroundColor(Color.WHITE);

            }
        });

        txtUpcoming.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                //highlighting Upcoming TextView
                txtUpcoming.setTextColor(Color.WHITE);
                txtUpcoming.setBackground(getDrawable(R.drawable.blue_bg_textview));

                // normalising Completed Text View
                txtCompleted.setTextColor(Color.BLACK);
                txtCompleted.setBackgroundColor(Color.WHITE);

            }
        });

        // adding Data to Events List
        eventDataList.add(new EventData("DSC Info Session", R.drawable.dsc_info_1));
        eventDataList.add(new EventData("Ideathon", R.drawable.idea));
        eventDataList.add(new EventData("Web Dev Boot Camp", R.drawable.web));
        eventDataList.add(new EventData("Mobile App Development", R.drawable.googleandroid));

        eventsDisplayAdapter = new EventsDisplayAdapter(EventsActivity.this, eventDataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(EventsActivity.this,LinearLayoutManager.VERTICAL,false);
        eventsList.setLayoutManager(linearLayoutManager);
        eventsList.setAdapter(eventsDisplayAdapter);

    }
}