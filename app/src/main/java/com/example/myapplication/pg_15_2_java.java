package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class pg_15_2_java extends AppCompatActivity {
    ImageButton btn_back;
    ImageButton btn_home;
    ImageButton btn_messenger;
    ImageButton btn_profile;
    ImageButton btn_store;
    ImageButton btn_config;
    Button btn_5000;
    Button btn_10000;
    Button btn_30000;
    Button btn_50000;
    Button btn_charge;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_15_2);

        btn_back = findViewById(R.id.imageButton);
        btn_home = findViewById(R.id.imageButton3);
        btn_messenger = findViewById(R.id.imageButton4);
        btn_profile= findViewById(R.id.imageButton6);
        btn_store = findViewById(R.id.imageButton7);
        btn_config = findViewById(R.id.imageButton5);
        btn_5000 = findViewById(R.id.button10);
        btn_10000 = findViewById(R.id.button11);
        btn_30000 = findViewById(R.id.button12);
        btn_50000 = findViewById(R.id.button13);
        btn_charge = findViewById(R.id.button16);
        EditText editText = (EditText)findViewById(R.id.editTextNumberDecimal);
        btn_5000.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String str = editText.getText().toString();
                    a = Integer.parseInt(str);
                    a += 5000;
                    str = Integer.toString(a);
                    editText.setText(str);
                } catch (NumberFormatException e) {
                    editText.setText("0");
                    String str = editText.getText().toString();
                    a = Integer.parseInt(str);
                    a += 5000;
                    str = Integer.toString(a);
                    editText.setText(str);
                } catch (Exception e) {
                    // Exception 이 발생한 경우 처리 방법
                }
            }
        });
        btn_10000.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String str = editText.getText().toString();
                    a = Integer.parseInt(str);
                    a += 10000;
                    str = Integer.toString(a);
                    editText.setText(str);
                } catch (NumberFormatException e) {
                    editText.setText("0");
                    String str = editText.getText().toString();
                    a = Integer.parseInt(str);
                    a += 10000;
                    str = Integer.toString(a);
                    editText.setText(str);
                } catch (Exception e) {
                    // Exception 이 발생한 경우 처리 방법
                }
            }
        });
        btn_30000.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String str = editText.getText().toString();
                    a = Integer.parseInt(str);
                    a += 30000;
                    str = Integer.toString(a);
                    editText.setText(str);
                } catch (NumberFormatException e) {
                    editText.setText("0");
                    String str = editText.getText().toString();
                    a = Integer.parseInt(str);
                    a += 30000;
                    str = Integer.toString(a);
                    editText.setText(str);
                } catch (Exception e) {
                    // Exception 이 발생한 경우 처리 방법
                }
            }
        });
        btn_50000.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    String str = editText.getText().toString();
                    a = Integer.parseInt(str);
                    a += 50000;
                    str = Integer.toString(a);
                    editText.setText(str);
                } catch (NumberFormatException e) {
                    editText.setText("0");
                    String str = editText.getText().toString();
                    a = Integer.parseInt(str);
                    a += 50000;
                    str = Integer.toString(a);
                    editText.setText(str);
                } catch (Exception e) {
                    // Exception 이 발생한 경우 처리 방법
                }
            }
        });
        btn_charge.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String str = editText.getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(), str+"원이 충전되었습니다",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),activity_main.class);
                startActivity(intent);
                finish();
            }
        });
        btn_messenger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),pg_25_java.class);
                startActivity(intent);
                finish();
            }
        });
        btn_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_my_profile.class);
                startActivity(intent);
                finish();
            }
        });
        btn_store.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),page_market_main.class);
                startActivity(intent);
                finish();
            }
        });
        btn_config.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),pg_14_java.class);
                startActivity(intent);
                finish();
            }
        });
    }
}