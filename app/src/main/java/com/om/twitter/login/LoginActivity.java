package com.om.twitter.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.om.twitter.R;
import com.om.twitter.signup.SignupActivity;

public class LoginActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
private TextView signup;
private EditText editText,editText1;
private Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        signin=findViewById(R.id.btn_login);
        editText=findViewById(R.id.et_name);
        editText1=findViewById(R.id.etpass);
        signup=findViewById(R.id.txtsignup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup= new Intent(LoginActivity.this, SignupSplash.class);
                    startActivity(signup);
            }
        });

    }
    public void showPopup(View v) {
        PopupMenu popupMenu=new PopupMenu(this,v);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menu);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.about:
                about();
//                Toast.makeText(this, "Ouch", Toast.LENGTH_SHORT).show();

                break;
            case R.id.proxy:
                Toast.makeText(this, "Ouchey", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }

    private void about() {
        Intent intent= new Intent(LoginActivity.this,About.class);
        startActivity(intent);

    }
}
