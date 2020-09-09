package com.gmrit.dscgmrit.activities.general;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.gmrit.dscgmrit.R;

public class SplashScreen extends AppCompatActivity {

    ImageView imgLogo;
    Animation anim;
    private static int SPLASH_TIMER = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imgLogo = findViewById(R.id.imgLogo);

        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);

        imgLogo.setAnimation(anim);

        try {

            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            wait(4000);
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(SplashScreen.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}