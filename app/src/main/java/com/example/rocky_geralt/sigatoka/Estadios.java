package com.example.rocky_geralt.sigatoka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Estadios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadios);

    }
    public void onBackPressed(){
        Intent menu = new Intent(Estadios.this, MenuPrincipal.class);
        startActivity(menu);

        Estadios.this.finish();
    }
}
