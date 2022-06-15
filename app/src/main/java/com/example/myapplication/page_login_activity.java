package com.example.myapplication;

import static android.view.View.GONE;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.myapplication.databinding.ActivityLoginBinding;
import com.example.myapplication.databinding.Pg14Binding;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class page_login_activity extends Fragment {

    Button button1, button2, button3, button4;
    ActivityLoginBinding binding;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = ActivityLoginBinding.inflate(inflater, container, false);
        context = container.getContext();
        button1 = binding.loginBtn;
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), activity_main.class);
            startActivity(intent);
        });
        button2 = binding.signUpBtn;
        button2.setOnClickListener(view -> {
            // 결제 수단 관리
            Intent intent = new Intent(getActivity(), page_signup.class);
            startActivity(intent);
        });
        button3 = binding.idSearchBtn;
        button3.setOnClickListener(view -> {
            // 드라이버 등록
            Intent intent = new Intent(getActivity(), activity_idsearch.class);
            startActivity(intent);
        });
        button4 = binding.passwordSearchBtn;
        button4.setOnClickListener(view -> {
            // 계정 설정
            Intent intent = new Intent(getActivity(), page_password.class);
            startActivity(intent);
        });
        return binding.getRoot();
    }
}
