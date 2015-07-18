package com.example.jeampierre.titanicshop.activities;

import android.content.Intent;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;


import com.example.jeampierre.titanicshop.R;
import com.example.jeampierre.titanicshop.adapters.CourseAdapter;
import com.example.jeampierre.titanicshop.pojos.ProductoPojo;
import com.example.jeampierre.titanicshop.pojos.Productos;

import com.example.jeampierre.titanicshop.daogenerator.*;
import com.example.jeampierre.titanicshop.daogenerator.DaoMaster.DevOpenHelper;

import android.database.sqlite.SQLiteDatabase;


public class MainActivity extends AppCompatActivity{

    public RecyclerView recyclerView;
    public LinearLayoutManager linearLayout;


    /**
     * Instancia del drawer
     */
    private DrawerLayout drawerLayout;

    /**
     * Titulo inicial del drawer
     */
    private String drawerTitle;



    private SQLiteDatabase db;



    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar(); // Setear Toolbar como action bar

        datos();

        setupRecyclerView(); // Preparar recycler view

        setupWindowAnimations(); // Añadir animaciones

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }




        drawerTitle = getResources().getString(R.string.titanic_item);
        if (savedInstanceState == null) {
            setTitle(drawerTitle);
        }

    }

    private void setupRecyclerView() {
        linearLayout = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.reciclador);
        recyclerView.setLayoutManager(linearLayout);
        CourseAdapter adapter = new CourseAdapter(this, Productos.getCourses());
        recyclerView.setAdapter(adapter);
    }

    private void setupWindowAnimations() {
        getWindow().setReenterTransition(new Explode());
        getWindow().setExitTransition(new Explode().setDuration(500));
    }


    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            // Poner ícono del drawer toggle
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

                            case R.id.nav_ordenes:{
                                //menuItem.setChecked(true);
                                Intent intent = new Intent(getApplicationContext(), Ordenes.class);
                                startActivity(intent);
                                drawerLayout.closeDrawers();
                                break;
                            }

                            case R.id.nav_facturas:{
                                //menuItem.setChecked(true);
                                Intent intent = new Intent(getApplicationContext(), Facturas.class);
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


    public void datos(){

        DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "Titanic", null);
        db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();
        ProductoDao productoDao = daoSession.getProductoDao();

        Producto p=new Producto(null,"champu","descripcion",34.2,"cabello", 3f,1);
        productoDao.insert(p);

        Producto p2=new Producto(null,"champu","descripcion",34.2,"cabello", 3f,1);
        productoDao.insert(p2);

        Producto p3=new Producto(null,"champu","descripcion",34.2,"cabello", 3f,1);
        productoDao.insert(p3);

        Producto p4=new Producto(null,"champu","descripcion",34.2,"cabello", 3f,1);
        productoDao.insert(p4);

        Producto p5=new Producto(null,"champu","descripcion",34.2,"cabello", 3f,1);
        productoDao.insert(p5);

        Producto p6=new Producto(null,"champu","descripcion",34.2,"cabello", 3f,1);
        productoDao.insert(p6);







    }



}
