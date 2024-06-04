package com.example.orkatrade;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.orkatrade.ui.ContentMain.LoginPgActivity;

public class StartupPgActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.startup_pg);
            Runnable startLoginActivity = new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(StartupPgActivity.this, LoginPgActivity.class);
                    startActivity(intent);
                    finish();
                }
            };

            Handler handler = new Handler();
            handler.postDelayed(startLoginActivity, 5000);


        }
    }