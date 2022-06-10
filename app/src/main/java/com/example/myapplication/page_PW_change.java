package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class page_PW_change extends AppCompatActivity {
    Button btn_pw ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page__p_w_change);

        btn_pw = findViewById(R.id.button);

        btn_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "비밀번호가 성공적으로 변경되었습니다.",Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}