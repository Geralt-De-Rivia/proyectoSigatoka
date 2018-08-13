package com.example.rocky_geralt.sigatoka;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Estadio3 extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderAdapter miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadio3);
        viewPager = findViewById(R.id.viewPager);
        miAdaptador = new SliderAdapter(this);
        viewPager.setAdapter(miAdaptador);


    }
}
