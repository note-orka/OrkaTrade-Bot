package com.example.orkatrade.ui.ContentMain;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.orkatrade.R;
import com.example.orkatrade.databinding.ContentMainBinding;
import com.example.orkatrade.ui.Charts.ChartFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContentMainActivity extends AppCompatActivity {

private ContentMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ContentMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.mobile_navigation);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_settings, R.id.navigation_notifications, R.id. navigation_trade)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.mobile_navigation);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView1, navController);
    }
};
