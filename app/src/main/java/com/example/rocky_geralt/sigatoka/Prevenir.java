package com.example.rocky_geralt.sigatoka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
En esta clase mostraremos toda la informacion que hemos añadido en el layout de activity_prevenir el cual estara como prevenir
y que manejo se le debe dar a los terrenos y la enfermedad
 */
public class Prevenir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevenir);
    }

    public void onBackPressed(){
        Intent menu = new Intent(Prevenir.this, MenuPrincipal.class);
        startActivity(menu);

        Prevenir.this.finish();
    }
}
