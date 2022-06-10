package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class page_nic_pw_change extends AppCompatActivity {
    Button btn_nick ;
    Button btn_pw ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_nic_pw_change);

        btn_nick = findViewById(R.id.button34);
        btn_pw = findViewById(R.id.button32);

        btn_nick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_NICK_change.class);
                startActivity(intent);
            }
        });

        btn_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),page_PW_change.class);
                startActivity(intent);
            }
        });


    }
}