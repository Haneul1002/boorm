package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ActivityPageMarketMainBinding;

import java.util.ArrayList;

public class page_market_main extends Fragment {
    ArrayList<marketData> data;
    Context context;
    RecyclerView recyclerView;
    marketRecyclerViewAdapter adapter;
    ActivityPageMarketMainBinding binding;
    ImageButton history, wishlist;
    Bitmap bitmap;
    @SuppressLint("NotifyDataSetChanged")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = ActivityPageMarketMainBinding.inflate(inflater, container, false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView = binding.recyclerView;
        context = container.getContext();
        recyclerView.setLayoutManager(layoutManager);
        data = new ArrayList<>();
        adapter = new marketRecyclerViewAdapter(data);
        recyclerView.setAdapter(adapter);
        for(int i=1;i<=5;i++){
            switch (i){
                case 1:
                    bitmap = drawableToBitmap(R.drawable.ic_s_oil);
                    break;
                case 2:
                    bitmap = drawableToBitmap(R.drawable.ic_s_oil);
                    break;
                case 3:
                    bitmap = drawableToBitmap(R.drawable.ic_s_oil);
                    break;
                case 4:
                    bitmap = drawableToBitmap(R.drawable.ic_s_oil);
                    break;
                case 5:
                    bitmap = drawableToBitmap(R.drawable.ic_s_oil);
                    break;
            }
            data.add( new marketData("주유권 "+i, i+"만원", bitmap));
            adapter.notifyDataSetChanged();
        }
        history = binding.history;
        history.setOnClickListener(view -> {
            AppCompatActivity activity = (AppCompatActivity) view.getContext();
            Fragment fragment = new page_market_history();
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
        });
        wishlist = binding.wishlist;
        wishlist.setOnClickListener(view -> {
            AppCompatActivity activity = (AppCompatActivity) view.getContext();
            Fragment fragment = new page_market_wishlist();
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
        });
        return binding.getRoot();
    }
    private Bitmap drawableToBitmap(int drawableRes) {
        @SuppressLint("UseCompatLoadingForDrawables") Drawable drawable = getResources().getDrawable(drawableRes);
        Canvas canvas = new Canvas();
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmap;
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