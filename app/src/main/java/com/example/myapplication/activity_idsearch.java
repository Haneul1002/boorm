package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.ActivityIdsearchBinding;

public class activity_idsearch extends Fragment {
    ActivityIdsearchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = ActivityIdsearchBinding.inflate(inflater, container, false);
        final ImageButton Button = (ImageButton) binding.Backbutton;

        Button.setOnClickListener(new View.OnClickListener() { // 이미지 버튼 이벤트 정의
            @Override
            public void onClick(View v) { //클릭 했을경우
                requireActivity().onBackPressed();
            }
        });
        return binding.getRoot();
    }
}