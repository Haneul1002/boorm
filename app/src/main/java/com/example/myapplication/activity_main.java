package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class activity_main extends Fragment {
    ArrayList<matching_Data> matching =  new ArrayList<matching_Data>();
    ListView listview;
    ImageButton imageButton31;
    ImageButton regretation;
    ActivityMainBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(inflater, container, false);

        matching.add( new matching_Data("철수", "남","D관","학교 정문",
                "6월","15일","15:00","조용히 가고 싶습니다", R.drawable.ic_aaaa));

        matching.add( new matching_Data("영희", "여","목원대학교","갤러리아 타임월드",
                "6월","15일","15:00","조용히 가고 싶습니다", R.drawable.ic_ryan));
        matching_DataAdater adapter= new matching_DataAdater( getLayoutInflater() , matching);

        listview = binding.listView;
        listview.setAdapter(adapter);

        imageButton31 = binding.imageButton31;
        regretation = binding.regretationButton;

        imageButton31.setOnClickListener(view -> {
           //새로고침
        });
        regretation.setOnClickListener(view -> {
            AppCompatActivity activity = (AppCompatActivity) view.getContext();
            Fragment fragment = new activity_main_regretation();
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
        });
        return binding.getRoot();
    }
}
