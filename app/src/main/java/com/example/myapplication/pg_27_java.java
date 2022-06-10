package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class pg_27_java extends AppCompatActivity {

    Button btnOnClick4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_27);

        btnOnClick4 = findViewById(R.id.button29);
        btnOnClick4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pg_27_1java.class);
                startActivity(intent);
            }
        });
    }
}