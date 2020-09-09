package com.gmrit.dscgmrit.activities.team;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.adapters.TeamAdapter;
import com.gmrit.dscgmrit.modals.TeamData;

import java.util.ArrayList;
import java.util.List;

public class TeamDisplayActivity extends AppCompatActivity {

    RecyclerView teamDataList;
    List<TeamData> dataList;
    TeamAdapter teamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_display);

        teamDataList = findViewById(R.id.teamList);

        dataList = new ArrayList<>();

        dataList.add(new TeamData("T.Chandra Sekhar", "Faculty Advisor","Faculty, Information Technology","Robotic Process Automation, Big Data Analytics, Hadoop Programming","+91 98491 83145","chandrasekhar.t@gmrit.edu.in",R.drawable.chandra_sekhar_sir));
        dataList.add(new TeamData("Koushik Modekurti", "DSC Lead","4th Year, Information Technology","Android, Data Analyst, Firebase, Backend Development, Cloud Computing, Web Development, AWS","+91 86397 96138","kouhsikmodekurti00@gmail.com",R.drawable.koushik_modekurti));
        dataList.add(new TeamData("Santosh Burada", "Android Developer","4th Year, Information Technology","Android, Python, Web Development, OpenCv, Java, ML", " +91 63031 49161" ,"santoshburada@gmail.com",R.drawable.santosh_burada));
        dataList.add(new TeamData("Vinay Sriram", "Web Developer","Web Development","2nd Year, Information Technology","+91 86884 86699","vinaysriramtummidi01@gmail.com",R.drawable.vinay_sriram));
        dataList.add(new TeamData("Saikiran Kopparthi", "Android Developer","3rd Year, Information Technology", "Machine Learing, Android, Firebase, php, CSS, REST API, Web Development, HTML5","+91 93813 84234","knvrssaikiran@gmail.com",R.drawable.saikiran_kopparthi));
        dataList.add(new TeamData("Juhi Siri Sai Jasti", "Media & Creatives","4th Year, Computer Science Engineering","Creativity, Graphic Design","+91 86397 96138","17341a0569@gmrit.edu.in",R.drawable.juhi_siri_sai_jasti));
        dataList.add(new TeamData("Sai Teja Vankayala", "Full Stack Developer","4th Year, Computer Science Engineering","Web Development, React, Django, REST API","+91 91826 61299","17341A05H1@gmrit.edu.in",R.drawable.saiteja_vankayala));
        dataList.add(new TeamData("Venkatesh Muvvala", "IoT Developer","4th Year, Electronics and Communications Engineering","Cyber Security, AWS, Game Development, HTML, CSS, IoT, Robotics","+91 91219 79986","17341A04C0@gmrit.edu.in",R.drawable.venkatesh_muvvala));

        teamAdapter = new TeamAdapter(TeamDisplayActivity.this, dataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TeamDisplayActivity.this, LinearLayoutManager.VERTICAL, false);
        teamDataList.setAdapter(teamAdapter);
        teamDataList.setLayoutManager(linearLayoutManager);


    }
}