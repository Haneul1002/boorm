package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class marketRecyclerViewAdapter extends RecyclerView.Adapter<marketRecyclerViewAdapter.MyViewHolder> {
    private final ArrayList<marketData> arrayList;
    public marketRecyclerViewAdapter(ArrayList<marketData> arrayList) {
        this.arrayList = arrayList;
        MyViewHolder.arrayList = arrayList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.list_market, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        marketData item = arrayList.get(position);
        holder.setItem(item);
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder {
        static public ArrayList<marketData> arrayList;
        TextView productName, productPrice;
        ImageView productImage;
        marketData item;
        boolean check;
        public MyViewHolder(View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.text_name);
            productPrice = itemView.findViewById(R.id.text_price);
            productImage = itemView.findViewById(R.id.img_flag);
            itemView.setOnClickListener(view -> {
                if(!check){
                    check = true;
//                    Toast.makeText(view.getContext(),(getAdapterPosition()+1)+"번 상품",Toast.LENGTH_SHORT).show();
                    item = arrayList.get(getAdapterPosition());
                    EtcFragment.image=item.getImage();
                    EtcFragment.name=item.name;
                    EtcFragment.price=item.price;
                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Fragment fragment = new EtcFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
                }
            });
        }
        private void setItem(marketData item) {
            productName.setText(item.getName());
            productPrice.setText(item.getPrice());
            productImage.setImageBitmap(item.getImage());
        }
    }
}