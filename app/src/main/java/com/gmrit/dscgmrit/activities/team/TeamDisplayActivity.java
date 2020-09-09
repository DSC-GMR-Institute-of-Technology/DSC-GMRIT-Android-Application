package com.gmrit.dscgmrit.activities.team;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.activities.general.MainActivity;
import com.gmrit.dscgmrit.adapters.TeamAdapter;
import com.gmrit.dscgmrit.modals.TeamData;

import java.util.ArrayList;
import java.util.List;

public class TeamDisplayActivity extends AppCompatActivity {

    RecyclerView teamDataList;
    List<TeamData> dataList;
    TeamAdapter teamAdapter;
    ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_display);

        teamDataList = findViewById(R.id.teamList);

        backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeamDisplayActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        dataList = new ArrayList<>();

        dataList.add(new TeamData("Mr. T.Chandra Sekhar", "Faculty Advisor","Faculty, Information Technology","Robotic Process Automation, Big Data Analytics, Hadoop Programming","chandrasekhar.t@gmrit.edu.in",R.drawable.chandra_sekhar_sir));
        dataList.add(new TeamData("Mr. Koushik Modekurti", "DSC Lead","4th Year, Information Technology","Android, Data Analyst, Firebase, Backend Development, Cloud Computing, Web Development, AWS","kouhsikmodekurti00@gmail.com",R.drawable.koushik_modekurti));
        dataList.add(new TeamData("Mr. Santosh Burada", "Android Developer","4th Year, Information Technology","Android, Python, Web Development, OpenCv, Java, ML","santoshburada@gmail.com",R.drawable.santosh_burada));
        dataList.add(new TeamData("Mr. Vinay Sriram", "Web Developer","Web Development","2nd Year, Information Technology","vinaysriramtummidi01@gmail.com",R.drawable.vinay_sriram));
        dataList.add(new TeamData("Mr. Saikiran Kopparthi", "Android Developer","3rd Year, Information Technology", "Machine Learing, Android, Firebase, php, CSS, REST API, Web Development, HTML5","knvrssaikiran@gmail.com",R.drawable.saikiran_kopparthi));
        dataList.add(new TeamData("Ms. Juhi Siri Sai Jasti", "Media & Creatives","4th Year, Computer Science Engineering","Creativity, Graphic Design","17341a0569@gmrit.edu.in",R.drawable.juhi_siri_sai_jasti));
        dataList.add(new TeamData("Mr. Sai Teja Vankayala", "Full Stack Developer","4th Year, Computer Science Engineering","Web Development, React, Django, REST API","17341A05H1@gmrit.edu.in",R.drawable.saiteja_vankayala));
        dataList.add(new TeamData("Mr. Venkatesh Muvvala", "IoT Developer","4th Year, Electronics and Communications Engineering","Cyber Security, AWS, Game Development, HTML, CSS, IoT, Robotics","17341A04C0@gmrit.edu.in",R.drawable.venkatesh_muvvala));

        teamAdapter = new TeamAdapter(TeamDisplayActivity.this, dataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TeamDisplayActivity.this, LinearLayoutManager.VERTICAL, false);
        teamDataList.setAdapter(teamAdapter);
        teamDataList.setLayoutManager(linearLayoutManager);


    }
}