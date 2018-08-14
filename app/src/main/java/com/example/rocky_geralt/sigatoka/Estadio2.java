package com.example.rocky_geralt.sigatoka;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Estadio2 extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderAdapterEstadio2 miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadio2);
        viewPager = findViewById(R.id.viewPager);
        miAdaptador = new SliderAdapterEstadio2(this);
        viewPager.setAdapter(miAdaptador);
    }
}
