package com.example.orkatrade.ui.Charts;

import android.os.Bundle;
import android.os.DropBoxManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.orkatrade.R;

import java.util.ArrayList;

public class LineChart {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chart, container, false);

        Object ColorTemplate;

        View chart;
        chart = view.findViewById(R.id);

        ArrayList<DropBoxManager.Entry> entries = new ArrayList<>();
        boolean add = entries.add(new DropBoxManager.Entry(1, 100));
        entries.add(new DropBoxManager.Entry(2, 200));
        entries.add(new DropBoxManager.Entry(3, 150));
        entries.add(new DropBoxManager.Entry(4, 250));
        entries.add(new DropBoxManager.Entry(5, 200));

        LineDataSet dataSet = new LineDataSet(entries, "Trading Data");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setDrawCircles(true);
        dataSet.setDrawValues(true);

        LineData data = new LineData(dataSet);
        chart.setData(data);

        XAxis xAxis = chart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(new String[]{"Day 1", "Day 2", "Day 3", "Day 4", "Day 5"}));

        chart.invalidate();

        return view;
    }

    private class XAxis {

    }

    private class LineData {
    }
}
