package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class pg_12_java extends AppCompatActivity {
    Button btn_review;
    Button btn_message;
    ImageButton btn_home;
    ImageButton btn_messenger;
    ImageButton btn_profile;
    ImageButton btn_store;
    ImageButton btn_config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_12);

        btn_message = findViewById(R.id.button);
        btn_review = findViewById(R.id.button2);
        btn_home = findViewById(R.id.imageButton3);
        btn_messenger = findViewById(R.id.imageButton4);
        btn_profile= findViewById(R.id.imageButton6);
        btn_store = findViewById(R.id.imageButton7);
        btn_config = findViewById(R.id.imageButton5);

        btn_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),pg_13_java.class);
                startActivity(intent);
            }
        });
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "안심 메세지를 전송하였습니다.",Toast.LENGTH_SHORT);
                toast.show();
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