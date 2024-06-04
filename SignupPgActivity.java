package com.example.orkatrade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.orkatrade.ui.ContentMain.ContentMainActivity;

public class SignupPgActivity extends AppCompatActivity {

    TextView nameTv, passTv, emailTv,confirmPassword;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_pg);
        nameTv = findViewById(R.id.username1);
        passTv = findViewById(R.id.password1);
        emailTv = findViewById(R.id.email);
        confirmPassword = findViewById(R.id.password2);


        btnRegister= (Button) findViewById(R.id. button2);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SignupPgActivity.this, ContentMainActivity.class);
                startActivity(intent);
            }
        });
    };
}