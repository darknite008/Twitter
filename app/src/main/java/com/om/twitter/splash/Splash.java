package com.om.twitter.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.om.twitter.R;
import com.om.twitter.createaccount.CreateAccount;

public class Splash extends AppCompatActivity {
private static int SPLASH_TIME_OUT=100 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                SharedPreferences sharedPreferences=getSharedPreferences("User",MODE_PRIVATE);
//                String username=sharedPreferences.getString("username","");
//                String password=sharedPreferences.getString("password","");
//
//                if(username.equals("admin") && password.equals("admin1")){
//                    Intent maintent= new Intent(Splash.this,Dashboard.class);
//                    startActivity(maintent);
//
//
//                }else{
//                    Intent maintent= new Intent(Splash.this,MainActivity.class);
//                    startActivity(maintent);
//                }
                Intent intent= new Intent(Splash.this, Splash2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
