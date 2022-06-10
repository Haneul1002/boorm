package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class pg_15_1_java extends AppCompatActivity {
    ImageButton btn_back;
    Button btn_reload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_15_1);

        ListView listView = (ListView)findViewById(R.id.listview1);
        List<String> list = new ArrayList<>();
        list.add("- 2000 포인트 \n 2022.03.28 마켓 사용");
        list.add("- 5000 포인트 \n 2022.04.21 마켓 사용");
        list.add("- 20000 포인트 \n 2022.05.10 마켓 사용");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        btn_reload = findViewById(R.id.button4);
        btn_back = findViewById(R.id.imageButton);


        btn_reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),pg_15_2_java.class);
                startActivity(intent);
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