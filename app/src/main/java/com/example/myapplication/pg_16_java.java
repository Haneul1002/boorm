package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pg_16_java extends AppCompatActivity {
    Button btn_id_pw;
    Button btn_drivreg;
    ImageButton btn_back;
    ImageButton btn_home;
    ImageButton btn_messenger;
    ImageButton btn_profile;
    ImageButton btn_store;
    ImageButton btn_config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_16);

        btn_id_pw = findViewById(R.id.button17);
        btn_drivreg = findViewById(R.id.button18);
        btn_back = findViewById(R.id.imageButton);
        btn_home = findViewById(R.id.imageButton3);
        btn_messenger = findViewById(R.id.imageButton4);
        btn_profile= findViewById(R.id.imageButton6);
        btn_store = findViewById(R.id.imageButton7);
        btn_config = findViewById(R.id.imageButton5);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_id_pw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_password.class);
                startActivity(intent);
            }
        });
        btn_drivreg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_my_drivereg1.class);
                startActivity(intent);
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
    }
}