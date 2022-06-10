package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import com.example.myapplication.databinding.ActivityPageMarketMainBinding;


public class page_market_main extends Fragment {
    ImageButton history, wishlist;
    ActivityPageMarketMainBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = ActivityPageMarketMainBinding.inflate(inflater, container, false);

        wishlist = binding.wishlist;
        history = binding.history;

        history.setOnClickListener(view -> {
            AppCompatActivity activity = (AppCompatActivity) view.getContext();
            Fragment fragment = new page_market_history();
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
        });

        wishlist.setOnClickListener(view -> {
            AppCompatActivity activity = (AppCompatActivity) view.getContext();
            Fragment fragment = new page_market_wishlist();
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
        });
        return binding.getRoot();
    }
}