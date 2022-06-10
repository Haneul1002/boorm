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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_16);

        btn_id_pw = findViewById(R.id.button17);
        btn_drivreg = findViewById(R.id.button18);
        btn_back = findViewById(R.id.imageButton);

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
    }
}