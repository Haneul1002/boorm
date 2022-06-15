package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class pg_26_1java extends AppCompatActivity {
    ImageButton btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_26_1);
        btn_exit = findViewById(R.id.imageButton26);

        btn_exit.setOnClickListener(view -> {
            finish();
        });
    }
}