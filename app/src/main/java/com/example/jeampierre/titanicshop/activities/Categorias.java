package com.example.jeampierre.titanicshop.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;


import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import com.example.jeampierre.titanicshop.fragments.GridFragment;
import com.example.jeampierre.titanicshop.R;

import java.util.ArrayList;
import java.util.List;


public class Categorias extends AppCompatActivity{

    ViewPager mViewPager;
    private DrawerLayout drawerLayout;

    private String drawerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        setToolbar(); // Añadir la toolbar

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }





        // Setear adaptador al viewpager.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        setupViewPager(mViewPager);

        // Preparar las pesta�as
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        tabs.setupWithViewPager(mViewPager);

        drawerTitle = getResources().getString(R.string.productos_item);
        if (savedInstanceState == null) {
            //selectItem(drawerTitle);
            setTitle(drawerTitle); // Setear título actual
        }





    }


    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        //menuItem.setChecked(true);

                        switch (menuItem.getItemId()) {
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

    /**
     * Muestra una {@link Snackbar} prefabricada
     *
     * @param msg Mensaje a proyectar
     */

    /*
    private void showSnackBar(String msg) {
        Snackbar.make(findViewById(R.id.fab), msg, Snackbar.LENGTH_LONG).show();
    }
    */
    /**
     * Establece la toolbar como action bar
     */
    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            // Poner �cono del drawer toggle
            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }

    }

    /**
     * Crea una instancia del view pager con los datos
     * predeterminados
     *
     * @param viewPager Nueva instancia
     */
    private void setupViewPager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(GridFragment.newInstance(1), getString(R.string.title_section1));
        adapter.addFragment(GridFragment.newInstance(2), getString(R.string.title_section2));
        adapter.addFragment(GridFragment.newInstance(3), getString(R.string.title_section3));
        viewPager.setAdapter(adapter);
    }

    /**
     * M�todo onClick() del FAB
     *
     * @param v View presionado
     */

    /**
    public void onFabClick(View v) {
        showSnackBar("Buscar producto");
    }

     */

    /**
     * Un {@link FragmentPagerAdapter} que gestiona las secciones, fragmentos y
     * t�tulos de las pesta�as
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragments.add(fragment);
            mFragmentTitles.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitles.get(position);
        }
    }




}
