package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.myapplication.databinding.ActivityPageMyListBinding;

public class page_my_list extends Fragment {
    ActivityPageMyListBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = ActivityPageMyListBinding.inflate(inflater, container, false);
        final ImageButton Button = (ImageButton) binding.imageButton;

        Button.setOnClickListener(new View.OnClickListener() { // 이미지 버튼 이벤트 정의
            @Override
            public void onClick(View v) { //클릭 했을경우
                requireActivity().onBackPressed();
            }
        });
        return binding.getRoot();
    }
}