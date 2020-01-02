package com.om.twitter.createaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.om.twitter.R;
import com.om.twitter.login.LoginActivity;
import com.om.twitter.signup.SignupActivity;


public class CreateAccount extends AppCompatActivity {
private TextView login;
private Button create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create=findViewById(R.id.btn_create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maintent= new Intent(CreateAccount.this, SignupActivity.class);
                startActivity(maintent);
            }
        });

        login=findViewById(R.id.txtlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maintent= new Intent(CreateAccount.this, LoginActivity.class);
                 startActivity(maintent);
            }
        });
    }
}
