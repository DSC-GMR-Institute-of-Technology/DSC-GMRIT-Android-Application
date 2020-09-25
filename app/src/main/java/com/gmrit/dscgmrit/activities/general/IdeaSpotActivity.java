package com.gmrit.dscgmrit.activities.general;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.api.ApiInterface;
import com.gmrit.dscgmrit.api.RetrofitClient;
import com.gmrit.dscgmrit.modals.IdeaSubmissionData;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IdeaSpotActivity extends AppCompatActivity {

    ImageView back, ideaSpotImage;
    EditText edtName, edtEmailID, edtPhone, edtJNTU, edtIdea_OneSentence, edtIdea_Summarize, edtIdea_Unique;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea_spot);
        back = findViewById(R.id.ideaSpotBackButton);
        ideaSpotImage = findViewById(R.id.ideaSpotImage);

        btnSubmit = findViewById(R.id.btnSubmit);

        Glide.with(IdeaSpotActivity.this).load(R.drawable.ideas_stock).into(ideaSpotImage);

        edtName = findViewById(R.id.editName);
        edtEmailID = findViewById(R.id.editMail);
        edtPhone = findViewById(R.id.editPhone);
        edtJNTU = findViewById(R.id.jntu);
        edtIdea_OneSentence = findViewById(R.id.Onesentence);
        edtIdea_Summarize = findViewById(R.id.summarizeIdea);
        edtIdea_Unique = findViewById(R.id.unique);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtName.getText().toString().trim();
                String emailID = edtEmailID.getText().toString().trim();
                String phone = edtPhone.getText().toString().trim();

                // need to send jntu to service
                String jntu = edtJNTU.getText().toString().trim();


                String one_sentence = edtIdea_OneSentence.getText().toString().trim();
                String summarize = edtIdea_Summarize.getText().toString().trim();
                String unique = edtIdea_Unique.getText().toString().trim();

                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("name", name);
                jsonObject.addProperty("email_id", emailID);
                jsonObject.addProperty("phone", phone);
                jsonObject.addProperty("idea_description", one_sentence);
                jsonObject.addProperty("idea_summarization", summarize);
                jsonObject.addProperty("idea_uniqueness", unique);
                jsonObject.addProperty("idea_title", jntu);

                ApiInterface apiInterface = RetrofitClient.getClient(IdeaSpotActivity.this).create(ApiInterface.class);

                apiInterface.processIdeaSubmission(jsonObject).enqueue(new Callback<IdeaSubmissionData>() {
                    @Override
                    public void onResponse(Call<IdeaSubmissionData> call, Response<IdeaSubmissionData> response) {

                        if(response.isSuccessful()) {

                            IdeaSubmissionData ideaSubmissionData = response.body();

                            assert ideaSubmissionData != null;

                            if(ideaSubmissionData.isStatus()) {

                                Toast.makeText(IdeaSpotActivity.this, "Idea Submmission Successful !", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(IdeaSpotActivity.this, HomePage.class);
                                startActivity(intent);

                            } else  {
                                Toast.makeText(IdeaSpotActivity.this, "Something Error Occurred !", Toast.LENGTH_SHORT).show();
                            }


                        } else {
                            Toast.makeText(IdeaSpotActivity.this, ""+response.message(), Toast.LENGTH_SHORT).show();
                        }



                    }

                    @Override
                    public void onFailure(Call<IdeaSubmissionData> call, Throwable t) {

                    }
                });










            }
        });



    }
}