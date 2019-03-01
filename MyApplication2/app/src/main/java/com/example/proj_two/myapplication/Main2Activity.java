package com.example.proj_two.myapplication;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private DrawerLayout menu;
    private  BlankFragment B1 = new BlankFragment();
    private BlankFragment2 B2 =new BlankFragment2();
    private BlankFragment3 B3 =new BlankFragment3();
    private BlankFragment4 B4 =new BlankFragment4();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        menu = findViewById(R.id.my_drawer_layout);

        if (savedInstanceState == null){

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.content_frame, B4)
                    .commit();
        }

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        menuItem.setChecked(true);
                        menu.closeDrawers();

                        if (menuItem.getItemId() == R.id.chooseСountry) {
                            menuItem.setChecked(true);
                            menu.closeDrawers();

                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.content_frame, B1)
                                    .addToBackStack(null)
                                    .commit();

                        } else if (menuItem.getItemId() == R.id.savedCountries) {
                            menuItem.setChecked(true);
                            menu.closeDrawers();

                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.content_frame, B2)
                                    .addToBackStack(null)
                                    .commit();

                        } else if (menuItem.getItemId() == R.id.countryInformation) {
                            menuItem.setChecked(true);
                            menu.closeDrawers();

                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.content_frame, B3)
                                    .addToBackStack(null)
                                    .commit();

                        } else if (menuItem.getItemId() == R.id.aboutThAuthor) {
                            menuItem.setChecked(true);
                            menu.closeDrawers();

                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.content_frame, B4)
                                    .addToBackStack(null)
                                    .commit();

                        }

                        return true;
                    }
                });

    }
}