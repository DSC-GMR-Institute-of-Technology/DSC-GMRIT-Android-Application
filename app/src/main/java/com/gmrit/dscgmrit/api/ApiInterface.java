package com.gmrit.dscgmrit.api;

import com.gmrit.dscgmrit.modals.IdeaSubmissionData;
import com.gmrit.dscgmrit.modals.TeamData;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

    @Headers("Content-Type: application/json")
    @POST("idea_submission.php")
    Call<IdeaSubmissionData> processIdeaSubmission(@Body JsonObject object);


    @Headers("Content-Type: application/json")
    @POST("load_team.php")
    Call<TeamData> processTeamDetails(@Body JsonObject object);






}
