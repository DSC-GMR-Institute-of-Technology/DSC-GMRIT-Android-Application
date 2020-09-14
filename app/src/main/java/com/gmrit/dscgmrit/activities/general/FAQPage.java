package com.gmrit.dscgmrit.activities.general;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.adapters.FAQAdapter;
import com.gmrit.dscgmrit.modals.FAQdata;

import java.util.ArrayList;
import java.util.List;

public class FAQPage extends AppCompatActivity {
    RecyclerView recyclerView;
    FAQAdapter adapter;
    List<FAQdata> data;
    ImageView back_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_q_page);

        recyclerView = findViewById(R.id.faqrecy);
        back_button = findViewById(R.id.faqsBackButton);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();;
            }
        });
        data = new ArrayList<>();

        data.add(new FAQdata("What is DSC?","Developer Student Clubs(DSC) are on-campus Communities to bridge the Gap between Theory & Practice.","15 September 2020",R.drawable.iconsbusinessmanwithbeard));
        data.add(new FAQdata("Who can join DSC?","Students from all under-graduate and graduate programs with an interest in growing as a Developer are welcome to DSC.","16 September 2020",R.drawable.iconscircledusermaleskintyp));
        data.add(new FAQdata("How can we join DSC - GMRIT?","Refer Community Section in our Page.","17 September 2020",R.drawable.iconsbusinessmanwithbeard));
        data.add(new FAQdata("What does DSC do?","DSC harness the knowledge base of students to empower the local Communities and Businesses with Technology.","18 September 2020",R.drawable.iconscircledusermaleskintyp));


        adapter = new FAQAdapter(this,data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}