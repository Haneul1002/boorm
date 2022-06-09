package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.myapplication.databinding.Pg14Binding;

public class pg_14_java extends Fragment {
    Button btn_log, btn_point, btn_payment, btn_registeration, btn_setting;
    Pg14Binding binding;
    Context context;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = Pg14Binding.inflate(inflater, container, false);
        context = container.getContext();
        btn_log = binding.button5;

        btn_log.setOnClickListener(view -> {
            // 사용기록
            AppCompatActivity activity = (AppCompatActivity) view.getContext();
            Fragment fragment = new page_my_list();
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
        });
        btn_point = binding.button6;
        btn_point.setOnClickListener(view -> {
            // 포인트 조회
            Toast.makeText(context,"포인트 조회",Toast.LENGTH_SHORT).show();
        });
        btn_payment = binding.button7;
        btn_payment.setOnClickListener(view -> {
            // 결제 수단 관리
            Toast.makeText(context,"결제 수단 관리",Toast.LENGTH_SHORT).show();
        });
        btn_registeration = binding.button8;
        btn_registeration.setOnClickListener(view -> {
            // 드라이버 등록
            Toast.makeText(context,"드라이버 등록",Toast.LENGTH_SHORT).show();
        });
        btn_setting = binding.button9;
        btn_setting.setOnClickListener(view -> {
            // 계정 설정
            Toast.makeText(context,"계정 설정",Toast.LENGTH_SHORT).show();
        });
        return binding.getRoot();
    }
}