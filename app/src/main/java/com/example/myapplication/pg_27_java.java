package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class pg_27_java extends AppCompatActivity {

    Button open_chat;
    ImageButton btn_friends;
    ImageButton btn_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_27);
        btn_friends = findViewById(R.id.imageButton13);
        btn_chat = findViewById(R.id.imageButton14);

        open_chat = findViewById(R.id.button29);
        open_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),pg_27_1java.class);
                startActivity(intent);
            }
        });
        btn_friends.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
        btn_chat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),pg_26_java.class);
                startActivity(intent);
                finish();
            }
        });
    }
}