package com.example.rocky_geralt.sigatoka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
