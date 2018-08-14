package com.example.rocky_geralt.sigatoka;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Estadio4 extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderAdapterEstadio4 miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadio4);
        viewPager = findViewById(R.id.viewPager);
        miAdaptador = new SliderAdapterEstadio4(this);
        viewPager.setAdapter(miAdaptador);
    }
}
