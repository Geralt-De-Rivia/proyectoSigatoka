package com.example.rocky_geralt.sigatoka;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Estadio6 extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderAdapterEstadio6 miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadio6);
        viewPager = findViewById(R.id.viewPager);
        miAdaptador = new SliderAdapterEstadio6(this);
        viewPager.setAdapter(miAdaptador);
    }
}
