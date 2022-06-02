package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pg_14_java extends AppCompatActivity {
    ImageButton btn_home;
    ImageButton btn_messenger;
    ImageButton btn_profile;
    ImageButton btn_store;
    ImageButton btn_config;

    ImageButton btn_back;
    Button btn_list;
    Button btn_point;
    Button btn_card;
    Button btn_dreg;
    Button btn_aconfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_14);

        btn_home = findViewById(R.id.imageButton3);
        btn_messenger = findViewById(R.id.imageButton4);
        btn_profile= findViewById(R.id.imageButton6);
        btn_store = findViewById(R.id.imageButton7);
        btn_config = findViewById(R.id.imageButton5);

        btn_back = findViewById(R.id.imageButton);
        btn_list = findViewById(R.id.button5);
        btn_point = findViewById(R.id.button6);
        btn_card = findViewById(R.id.button7);
        btn_dreg = findViewById(R.id.button8);
        btn_aconfig = findViewById(R.id.button9);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),activity_main.class);
                startActivity(intent);
                finish();
            }
        });
        btn_messenger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),pg_25_java.class);
                startActivity(intent);
                finish();
            }
        });
        btn_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_my_profile.class);
                startActivity(intent);
                finish();
            }
        });
        btn_store.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_market_main.class);
                startActivity(intent);
                finish();
            }
        });
        btn_config.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),pg_14_java.class);
                startActivity(intent);
                finish();
            }
        });

        btn_list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_my_list.class);
                startActivity(intent);
                finish();
            }
        });
        btn_point.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),pg_15_1_java.class);
                startActivity(intent);
                finish();
            }
        });
        btn_card.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_my_payment.class);
                startActivity(intent);
                finish();
            }
        });
        btn_dreg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_my_drivereg.class);
                startActivity(intent);
                finish();
            }
        });
        btn_aconfig.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_my_profile_edit.class);
                startActivity(intent);
                finish();
            }
        });
    }
}