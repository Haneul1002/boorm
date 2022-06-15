package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class pg_26_java extends AppCompatActivity {
    Button btn_hong;
    ImageButton btn_friends;
    ImageButton btn_openchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_26);

        btn_hong = findViewById(R.id.button31);
        btn_friends = findViewById(R.id.imageButton13);
        btn_openchat = findViewById(R.id.imageButton15);

        btn_hong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),pg_26_1java.class);
                startActivity(intent);
            }
        });
        btn_friends.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
        btn_openchat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),pg_27_java.class);
                startActivity(intent);
                finish();
            }
        });
    }
}