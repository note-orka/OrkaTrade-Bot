package com.example.orkatrade.ui.Charts;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.orkatrade.R;

public class ChartFragment extends Fragment {

    private LineChart chart;

    @Nullable
    @Override

}

public class ContentMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onCreate(R.layout.content_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ChartFragment())
                .commit();
    }

    public FragmentManager getSupportFragmentManager() {
        return null;
    }
}