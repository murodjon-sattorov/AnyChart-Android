package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Radar;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class RadarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Radar radar = new Radar();
        radar.setTitle("'WoW base stats comparison radar chart: Shaman vs Warrior vs Priest'");
        radar.setLine(new String[]{
                "['Strength', 136]",
                "['Agility', 79]",
                "['Stamina', 149]",
                "['Intellect', 135]",
                "['Spirit', 158]"
        }, TextParsingMode.CSV);
        radar.setLine(new String[]{
                "['Strength', 199]",
                "['Agility', 125]",
                "['Stamina', 173]",
                "['Intellect', 33]",
                "['Spirit', 64]"
        }, TextParsingMode.CSV);
        radar.setLine(new String[]{
                "['Strength', 43]",
                "['Agility', 56]",
                "['Stamina', 101]",
                "['Intellect', 202]",
                "['Spirit', 196]"
        }, TextParsingMode.CSV);

        anyChartView.setChart(radar);
    }
}