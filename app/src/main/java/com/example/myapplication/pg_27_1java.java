package com.example.myapplication;

import android.content.Intent;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ListView;

import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class pg_27_1java extends AppCompatActivity {
    ChatMessageAdapter chatMessageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_27_1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //getMenuInflater().inflate(R.menu.menu_main, menu);

        chatMessageAdapter = new ChatMessageAdapter(this.getApplicationContext(), R.layout.pg_27_1);
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(chatMessageAdapter);
        listView.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);

        chatMessageAdapter.registerDataSetObserver(new DataSetObserver() {
            @Override
            public void onChanged() {
                super.onChanged();
                listView.setSelection(chatMessageAdapter.getCount() - 1);
            }
        });
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();

        if (id == R.id.imageButton28) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void send(View view) {
        EditText etMsg = (EditText) findViewById(R.id.editTextTextPersonName);
        String strMsg = (String)etMsg.getText().toString();
        chatMessageAdapter.add(new ChatMessage(strMsg));
    }


}