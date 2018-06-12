package com.example.rocky_geralt.sigatoka;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    private int duracionSplash = 3000; //los milisegundos que dura el splash

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent nuevoLayout = new Intent(Splash.this, MenuPrincipal.class);
                startActivity(nuevoLayout);

                Splash.this.finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(task, duracionSplash);
    }
}
