package com.example.myapplication;

import static android.view.View.GONE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page_login_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = (Button) findViewById(R.id.login_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

        });

        Button button2 = (Button) findViewById(R.id.sign_up_btn);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), page_signup.class);
                startActivity(intent);
            }

        });
        Button button3 = (Button) findViewById(R.id.id_search_btn);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_idsearch.class);
                startActivity(intent);
            }

        });

        Button button4 = (Button) findViewById(R.id.password_search_btn);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), page_password.class);
                startActivity(intent);
            }

        });


        Button button5 = (Button) findViewById(R.id.naver_btn);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "서비스 준비중입니다.",Toast.LENGTH_SHORT);
                toast.show();
            }

        });

        Button button6 = (Button) findViewById(R.id.kakao_btn);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), page_password.class);
                startActivity(intent);
            }

        });


    }
}

