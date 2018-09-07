package com.example.rocky_geralt.sigatoka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
En esta clase encontramos toda la informacion que hemos introducido en el layout de activity_sigatoka
donde se nos mostrara todos los datos de que es la sigatoka
 */
public class Sigatoka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigatoka);
    }

    public void onBackPressed(){
        Intent menu = new Intent(Sigatoka.this, MenuPrincipal.class);
        startActivity(menu);

        Sigatoka.this.finish();
    }
}
