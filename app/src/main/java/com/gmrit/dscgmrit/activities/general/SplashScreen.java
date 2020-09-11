package com.gmrit.dscgmrit.activities.general;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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

        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anim);

        imgLogo.setAnimation(anim);


        imgLogo.startAnimation(anim);

        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 4 seconds
                    sleep(SPLASH_TIMER);

                    // After 5 seconds redirect to another intent
                    Intent intent = new Intent(getBaseContext(), HomePage.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };
        // start thread
        background.start();

    }
}