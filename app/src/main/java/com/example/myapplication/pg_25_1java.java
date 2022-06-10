package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class pg_25_1java extends AppCompatActivity {

    Button button22;
    ImageButton imageButton26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_25_1);

        button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(pg_25_1java.this, pg_25_java.class) ;

                // Name 입력 값을 String 값으로 그대로 전달.
                EditText editTextName = (EditText) findViewById(R.id.editTextTextPersonName) ;
                intent.putExtra("contact_name", editTextName.getText().toString()) ;

                // 아이디 입력 값을 String 값으로 그대로 전달.
                EditText editTextPhone = (EditText) findViewById(R.id.editTextTextPersonName3) ;
                intent.putExtra("contact_phone", editTextPhone.getText().toString()) ;


                startActivity(intent) ;
            }
        });
        imageButton26 = findViewById(R.id.imageButton26);
        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pg_25_java.class);
                startActivity(intent);
            }
        });
    }


}