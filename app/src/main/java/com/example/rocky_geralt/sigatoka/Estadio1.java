package com.example.rocky_geralt.sigatoka;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Estadio1 extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderAdapterEstadio1 miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadio1);
        viewPager = findViewById(R.id.viewPager);
        miAdaptador = new SliderAdapterEstadio1(this);
        viewPager.setAdapter(miAdaptador);
    }
}
