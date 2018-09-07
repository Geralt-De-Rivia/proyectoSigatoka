package com.example.rocky_geralt.sigatoka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*
En esta clase encontramos unas imagenes que hemos definido en el layout activity_sennova
donde hay informacion de la dependencia Sennova.
 */
public class Sennova extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sennova);
    }

    public void onBackPressed(){
        Intent menu = new Intent(Sennova.this, MenuPrincipal.class);
        startActivity(menu);

        Sennova.this.finish();
    }
}
