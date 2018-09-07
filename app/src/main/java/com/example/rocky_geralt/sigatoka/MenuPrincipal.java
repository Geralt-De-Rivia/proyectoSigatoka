package com.example.rocky_geralt.sigatoka;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

/*
    Esta clase es el menu principal donde estaran los botones y diseño que hemos creado en el layout menu_principal
    Cada uno de los botones de nuestro layout han sido programados para ser enviados a sus respectivas clases y con su diseño creado en
    los layout's, tambien tenemos programado el menu lateral izquierdo donde estaran las mismas opciones que los botones en pantalla
    las cuales nos enviaran a sus repesctivas clases
 */
public class MenuPrincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button btn_sigatoka;
    private Button btn_estadios;
    private Button btn_prevenir;
    private Button btn_sennova;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_sigatoka = findViewById(R.id.btn_sigatoka);
        btn_estadios = findViewById(R.id.btn_estadios);
        btn_prevenir = findViewById(R.id.btn_prevenir);
        btn_sennova = findViewById(R.id.btn_sennova);

        btn_sigatoka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, Sigatoka.class);
                startActivity(intent);
                MenuPrincipal.this.finish();
            }
        });

        btn_estadios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, Estadios.class);
                startActivity(intent);
                MenuPrincipal.this.finish();
            }
        });
        btn_prevenir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, Prevenir.class);
                startActivity(intent);
                MenuPrincipal.this.finish();
            }
        });
        btn_sennova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, Sennova.class);
                startActivity(intent);
                MenuPrincipal.this.finish();
            }
        });

        //Programamos para que cuando el usuario oprima el icono del menu
        // abra el menu lateral si esta cerrado y que lo cierre si esta abierto
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Almacenamos en la variable id la opcion o item escojido en el menu y retornamos la opcion que tomo
        //Para luego ser evaluada y abrir la clase correspondiente
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    //Validacion del menu lateral donde se enviaran a sus respectivas clases dependiendo la opcion que halla seleccionado
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.sigatoka) {
            Intent sigatoka = new Intent(MenuPrincipal.this, Sigatoka.class);
            startActivity(sigatoka);
            MenuPrincipal.this.finish();
        } else if (id == R.id.estadios) {
            Intent estadios = new Intent(MenuPrincipal.this, Estadios.class);
            startActivity(estadios);
            MenuPrincipal.this.finish();
        } else if (id == R.id.prevenir) {
            Intent prevenir = new Intent(MenuPrincipal.this, Prevenir.class);
            startActivity(prevenir);
            MenuPrincipal.this.finish();
        } else if (id == R.id.sennova) {
            Intent sennova = new Intent(MenuPrincipal.this, Sennova.class);
            startActivity(sennova);
            MenuPrincipal.this.finish();
        } else if (id == R.id.regional) {
            Intent regional = new Intent(MenuPrincipal.this, Regional.class);
            startActivity(regional);
            MenuPrincipal.this.finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
