package com.gmrit.dscgmrit.activities.team;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gmrit.dscgmrit.R;

public class IndividualTeamDetailsActivity extends AppCompatActivity {

    LinearLayout backgroundImageLayout, teamPhoto;
    ImageView imgGithub,imgLinkedin,imgInstagram;
    TextView txtName,txtRoleName, txtYearDept, txtInterests, txtPhone, txtEmailID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_team_details);

        backgroundImageLayout = findViewById(R.id.backgroundImageLayout);

        imgGithub = findViewById(R.id.imageGithub);
        imgLinkedin = findViewById(R.id.imageLinkedin);
        imgInstagram = findViewById(R.id.imageInstagram);

        teamPhoto = findViewById(R.id.imageTeamPhoto);

        txtName = findViewById(R.id.txtName);
        txtRoleName = findViewById(R.id.txtRoleName);
        txtYearDept = findViewById(R.id.txtYearDept);
        txtInterests = findViewById(R.id.txtInterests);
        txtPhone = findViewById(R.id.txtPhoneNumber);
        txtEmailID = findViewById(R.id.txtEmailID);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String name = bundle.getString("name");
        String roleName = bundle.getString("roleName");
        int teamPhotoName = bundle.getInt("imageTeamPhoto");
        String yearDept = bundle.getString("yearDept");
        String interests = bundle.getString("interests");
        String phone = bundle.getString("phoneNumber");
        String emailID = bundle.getString("emailID");

        assert roleName != null;
        switch (roleName) {
            case "Android Developer":
                backgroundImageLayout.setBackgroundResource(R.drawable.green_background);
                break;
            case "Web Developer":
                backgroundImageLayout.setBackgroundResource(R.drawable.blue_background);
                break;
            case "Media & Creatives":
            case "Faculty Advisor":
                backgroundImageLayout.setBackgroundResource(R.drawable.yellow_background);
                break;
            default:
                backgroundImageLayout.setBackgroundResource(R.drawable.red_background);
                break;
        }

        txtName.setText(name);
        txtRoleName.setText(roleName);
        txtYearDept.setText(yearDept);
        txtEmailID.setText(emailID);
        txtInterests.setText(interests);
        txtPhone.setText(phone);

        teamPhoto.setBackgroundResource(teamPhotoName);


    }
}