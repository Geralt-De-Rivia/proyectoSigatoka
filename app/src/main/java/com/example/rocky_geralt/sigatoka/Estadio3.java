package com.example.rocky_geralt.sigatoka;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
En esta clase hemos ingresado a el estadio 3 donde se nos mostrara las imagenes del platano en esta fase de la enfermedad.
Tenemos un Slider donde nos va a mostrar las imagenes que tenemos almacenadas en el Drawable y el cual hemos declarado las imagenes
en la clase de SliderAdapterEstadio3 en el cual asignamos las imagenes correspondientes.
 */

public class Estadio3 extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderAdapterEstadio3 miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadio3);
        viewPager = findViewById(R.id.viewPager);
        miAdaptador = new SliderAdapterEstadio3(this);
        viewPager.setAdapter(miAdaptador);


    }
}
