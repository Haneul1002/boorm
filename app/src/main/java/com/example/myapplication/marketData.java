package com.example.myapplication;

import android.graphics.Bitmap;

public class marketData {
    String name; //상품 명
    String price;// 가격
    Bitmap image; // 상품 이미지
    public marketData(String name, String price, Bitmap image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setImage(Bitmap imgId) {
        this.image = imgId;
    }
    public String getName()
    {
        return name;
    }
    public String getPrice()
    {
        return price;
    }
    public Bitmap getImage()
    {
        return image;
    }
}

