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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_12);

        btn_message = findViewById(R.id.button);
        btn_review = findViewById(R.id.button2);

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

    }
}