package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.TestBinding;

public class EtcFragment extends Fragment {
    TestBinding binding;
    Context context;
    TextView nameTextView, priceTextView;
    @SuppressLint("StaticFieldLeak")
    Button buy;
    ImageView imageView;
    public static String name, price;
    public static Bitmap image;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = TestBinding.inflate(inflater, container, false);
        context = container.getContext();
        buy = binding.buyButton;
        imageView = binding.testImage;
        imageView.setImageBitmap(image);
        nameTextView = binding.testName;
        nameTextView.setText(name);
        priceTextView = binding.testPrice;
        priceTextView.setText(price);


        final ImageButton Button = (ImageButton) binding.imageButton;

        Button.setOnClickListener(new View.OnClickListener() { // 이미지 버튼 이벤트 정의
            @Override
            public void onClick(View v) { //클릭 했을경우
                requireActivity().onBackPressed();
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getContext(),"준비중입니다.",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return binding.getRoot();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}