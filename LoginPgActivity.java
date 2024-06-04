package com.example.orkatrade.ui.ContentMain;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.orkatrade.R;
import com.example.orkatrade.SignupPgActivity;


public class LoginPgActivity extends AppCompatActivity {
    TextView  pass1Tv, email1Tv;
    Button btnlogin;
    Button btnRegister;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_pg);
        pass1Tv = findViewById(R.id.password);
        email1Tv = findViewById(R.id.username);
        btnlogin = (Button) findViewById(R.id.log_in);
        btnRegister= (Button) findViewById(R.id. button2);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(LoginPgActivity.this, SignupPgActivity.class);
                startActivity(intent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent= new Intent(LoginPgActivity.this, ContentMainActivity.class);
            startActivity(intent);
        }
    });
};
    }
