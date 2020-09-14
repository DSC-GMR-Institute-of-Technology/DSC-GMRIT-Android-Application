package com.gmrit.dscgmrit.activities.team;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gmrit.dscgmrit.R;

public class IndividualTeamDetailsActivity extends AppCompatActivity {

    NestedScrollView backgroundImageLayout;
    LinearLayout teamPhoto;
    ImageView imgGithub,imgLinkedin,imgInstagram, backButton;
    TextView txtName,txtRoleName, txtYearDept, txtInterests, txtPhone, txtEmailID, txtCopyRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_team_details);

        backgroundImageLayout = findViewById(R.id.backgroundImageLayout);

        backButton = findViewById(R.id.back_button);

        imgGithub = findViewById(R.id.imageGithub);
        imgLinkedin = findViewById(R.id.imageLinkedin);
        imgInstagram = findViewById(R.id.imageInstagram);

        teamPhoto = findViewById(R.id.imageTeamPhoto);

        txtName = findViewById(R.id.txtName);
        txtRoleName = findViewById(R.id.txtRoleName);
        txtYearDept = findViewById(R.id.txtYearDept);
        txtInterests = findViewById(R.id.txtInterests);
        txtEmailID = findViewById(R.id.txtEmailID);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String name = bundle.getString("name");
        String roleName = bundle.getString("roleName");
        int teamPhotoName = bundle.getInt("imageTeamPhoto");
        String yearDept = bundle.getString("yearDept");
        String interests = bundle.getString("interests");
        String emailID = bundle.getString("emailID");

        assert roleName != null;
        switch (roleName) {
            case "Android Developer":
                backgroundImageLayout.setBackgroundResource(R.drawable.green_background);
                imgGithub.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorGreen)));
                imgInstagram.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorGreen)));
                imgLinkedin.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorGreen)));
                backButton.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorGreen)));
                break;
            case "Web Developer":
                backgroundImageLayout.setBackgroundResource(R.drawable.blue_background);
                imgGithub.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorBlue)));
                imgInstagram.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorBlue)));
                imgLinkedin.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorBlue)));
                backButton.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorBlue)));
                break;
            case "Media & Creatives":
            case "Faculty Advisor":
                backgroundImageLayout.setBackgroundResource(R.drawable.yellow_background);
                imgGithub.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorYellow)));
                imgInstagram.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorYellow)));
                imgLinkedin.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorYellow)));
                backButton.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorYellow)));
                break;
            default:
                backgroundImageLayout.setBackgroundResource(R.drawable.red_background);
                imgGithub.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorRed)));
                imgInstagram.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorRed)));
                imgLinkedin.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorRed)));
                backButton.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorRed)));
                break;
        }

        txtName.setText(name);
        txtRoleName.setText(roleName);
        txtYearDept.setText(yearDept);
        txtEmailID.setText(emailID);
        txtInterests.setText(interests);

        teamPhoto.setBackgroundResource(teamPhotoName);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndividualTeamDetailsActivity.this, TeamDisplayActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });



    }
}