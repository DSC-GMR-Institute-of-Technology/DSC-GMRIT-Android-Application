package com.gmrit.dscgmrit.activities.team;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.activities.general.HomePage;
import com.gmrit.dscgmrit.adapters.TeamAdapter;
import com.gmrit.dscgmrit.api.ApiInterface;
import com.gmrit.dscgmrit.api.RetrofitClient;
import com.gmrit.dscgmrit.modals.TeamData;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

        backButton = findViewById(R.id.teamBackButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeamDisplayActivity.this, HomePage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        dataList = new ArrayList<>();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("parameter", "core team");

        ApiInterface apiInterface = RetrofitClient.getClient(this).create(ApiInterface.class);

        apiInterface.processTeamDetails(jsonObject).enqueue(new Callback<TeamData>() {
            @Override
            public void onResponse(Call<TeamData> call, Response<TeamData> response) {
                if(response.isSuccessful()) {

                    TeamData teamData = response.body();

                    assert teamData != null;

                    if(teamData.isStatus()) {

                        List<TeamData.DataBean> resultBean = teamData.getData();

                        teamAdapter = new TeamAdapter(TeamDisplayActivity.this, resultBean);
                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TeamDisplayActivity.this, LinearLayoutManager.VERTICAL, false);
                        teamDataList.setLayoutManager(linearLayoutManager);
                        teamDataList.setAdapter(teamAdapter);

                    }

                } else {
                    Toast.makeText(TeamDisplayActivity.this, "Something Error Occurred !", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TeamData> call, Throwable t) {

            }
        });








    }


}