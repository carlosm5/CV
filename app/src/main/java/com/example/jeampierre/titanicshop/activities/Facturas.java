package com.example.jeampierre.titanicshop.activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.AppCompatActivity;

import com.example.jeampierre.titanicshop.R;


public class Facturas extends AppCompatActivity {

    /**
     * Instancia del drawer
     */
    private DrawerLayout drawerLayout;

    /**
     * Titulo inicial del drawer
     */
    private String drawerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facturas);

        setToolbar(); // Setear Toolbar como action bar

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

        drawerTitle = getResources().getString(R.string.facturas_item);
        if (savedInstanceState == null) {
            //selectItem(drawerTitle);
            setTitle(drawerTitle);
        }

    }


    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            // Poner icono del drawer toggle
            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        //menuItem.setChecked(true);
                        switch (menuItem.getItemId()) {

                            case R.id.nav_productos:{
                                //menuItem.setChecked(true);
                                Intent intent = new Intent(getApplicationContext(), Categorias.class);
                                startActivity(intent);
                                drawerLayout.closeDrawers();
                                break;
                            }

                            case R.id.nav_home:{
                                //menuItem.setChecked(true);
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                                drawerLayout.closeDrawers();
                                break;
                            }

                            case R.id.nav_ordenes:{
                                //menuItem.setChecked(true);
                                Intent intent = new Intent(getApplicationContext(), Ordenes.class);
                                startActivity(intent);
                                drawerLayout.closeDrawers();
                                break;
                            }

                        }
                        return true;
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

  


}
