package com.om.twitter.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.om.twitter.R;
import com.om.twitter.createaccount.CreateAccount;
import com.om.twitter.signup.SignupActivity;

public class SignupSplash extends AppCompatActivity {
private static int SPLASH_TIME_OUT=100 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SignupSplash.this, SignupActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
