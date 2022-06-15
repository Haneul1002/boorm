package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.Pg25Binding;

public class pg_25_java extends Fragment {
    ImageButton btn_chat, btn_openchat;
    Pg25Binding binding;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = Pg25Binding.inflate(inflater, container, false);
        context = container.getContext();
        btn_chat = binding.imageButton14;
        btn_openchat = binding.imageButton15;


        btn_chat.setOnClickListener(view -> {
            // 사용기록
            Intent intent = new Intent(getActivity(), pg_26_java.class);
            startActivity(intent);
        });
        btn_openchat.setOnClickListener(view -> {
            // 사용기록
            Intent intent = new Intent(getActivity(), pg_27_java.class);
            startActivity(intent);
        });
        return binding.getRoot();
    }
}