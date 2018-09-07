package com.example.rocky_geralt.sigatoka;

/*
En esta clase hemos ingresado a el estadio 1 donde se nos mostrara las imagenes del platano en esta fase de la enfermedad.
Tenemos un Slider donde nos va a mostrar las imagenes que tenemos almacenadas en el Drawable y el cual hemos declarado las imagenes
en la clase de SliderAdapterEstadio1 en el cual asignamos las imagenes correspondientes
 */
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Estadio1 extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderAdapterEstadio1 miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadio1);
        viewPager = findViewById(R.id.viewPager);

        //Creamos un objeto llamado miAdaptador el cual recibe los valores de la clase SliderAdapterEstadio1
        miAdaptador = new SliderAdapterEstadio1(this);
        viewPager.setAdapter(miAdaptador);
    }
}
