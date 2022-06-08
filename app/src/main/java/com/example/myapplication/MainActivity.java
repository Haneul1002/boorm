package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Fragment main;
    Fragment Message;
    Fragment Market;
    Fragment My_profile;
    Fragment etc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        main = new activity_main();
        Message = new pg_25_java();
        Market = new page_market_main();
        My_profile = new page_my_profile();
        etc = new pg_14_java();

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,main).commit();

        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item){
                        switch (item.getItemId()) {
                            case R.id.tab_home:
                                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, main).commit();
                                return true;
                            case R.id.tab_message:
                                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, Message).commit();
                                return true;
                            case R.id.tab_market:
                                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, Market).commit();
                                return true;
                            case R.id.tab_my_profile:
                                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, My_profile).commit();
                                return true;
                            case R.id.tab_settings:
                                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, etc).commit();
                                return true;
                        }
                        return false;
                    }

                });

    }
}