package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class pg_13_java extends AppCompatActivity {
    Button btn_complete ;
    ImageButton btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_13);

        btn_complete = findViewById(R.id.button3);
        btn_back = findViewById(R.id.imageButton);


        btn_complete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast toast = Toast.makeText(getApplicationContext(), "리뷰를 성공적으로 작성하였습니다.",Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}