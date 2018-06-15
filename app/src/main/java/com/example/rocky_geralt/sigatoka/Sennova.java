package com.example.rocky_geralt.sigatoka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
