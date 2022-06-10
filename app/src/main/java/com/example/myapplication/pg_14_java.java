package com.example.myapplication;
import android.content.Context;
import android.content.Intent;
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
            Intent intent = new Intent(getActivity(), pg_15_1_java.class);
            startActivity(intent);
        });
        btn_payment = binding.button7;
        btn_payment.setOnClickListener(view -> {
            // 결제 수단 관리
            Intent intent = new Intent(getActivity(), page_my_payment.class);
            startActivity(intent);
        });
        btn_registeration = binding.button8;
        btn_registeration.setOnClickListener(view -> {
            // 드라이버 등록
            Intent intent = new Intent(getActivity(), page_my_drivereg.class);
            startActivity(intent);
        });
        btn_setting = binding.button9;
        btn_setting.setOnClickListener(view -> {
            // 계정 설정
            Intent intent = new Intent(getActivity(), page_nic_pw_change.class);
            startActivity(intent);
        });
        return binding.getRoot();
    }
}