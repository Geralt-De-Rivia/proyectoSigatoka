package com.example.rocky_geralt.sigatoka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
En esta clase tenemos la informacion de todos los estadios el cual cada uno tiene un boton para acceder a sus respectivas imagenes
 */
public class Estadios extends AppCompatActivity {

    private Button btnEstadio1;
    private Button btnEstadio2;
    private Button btnEstadio3;
    private Button btnEstadio4;
    private Button btnEstadio5;
    private Button btnEstadio6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadios);

        //Creamos un objeto con el nombre de cada boton y llamamos los botones correspondientes al layout de los estadios con el metodo
        //findViewById
        btnEstadio1 = findViewById(R.id.btnEstadio1);
        btnEstadio2 = findViewById(R.id.btnEstadio2);
        btnEstadio3 = findViewById(R.id.btnEstadio3);
        btnEstadio4 = findViewById(R.id.btnEstadio4);
        btnEstadio5 = findViewById(R.id.btnEstadio5);
        btnEstadio6 = findViewById(R.id.btnEstadio6);

        btnEstadio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Estadios.this, Estadio1.class);
                startActivity(intent);
            }
        });

        btnEstadio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Estadios.this, Estadio2.class);
                startActivity(intent);
            }
        });
        btnEstadio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Estadios.this, Estadio3.class);
                startActivity(intent);
            }
        });
        btnEstadio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Estadios.this, Estadio4.class);
                startActivity(intent);
            }
        });
        btnEstadio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Estadios.this, Estadio5.class);
                startActivity(intent);
            }
        });
        btnEstadio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Estadios.this, Estadio6.class);
                startActivity(intent);
            }
        });

    }
    public void onBackPressed(){
        Intent menu = new Intent(Estadios.this, MenuPrincipal.class);
        startActivity(menu);

        Estadios.this.finish();
    }
}
