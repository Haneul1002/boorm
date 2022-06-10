package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class page_NICK_change extends AppCompatActivity {
    Button btn_nick ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page__n_i_c_k_change);

        btn_nick = findViewById(R.id.button30);

        btn_nick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast toast = Toast.makeText(getApplicationContext(), "닉네임이 성공적으로 변경되었습니다.",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}