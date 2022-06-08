package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class pg_28_java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_28);
    }

    public void btnOnClick1(View view) {
        AlertDialog.Builder dig = new AlertDialog.Builder((pg_28_java.this));
        dig.setTitle("(이벤트) 카풀 이용하고 스탬프 받자!");
        dig.setMessage("카풀 이용할수록 혜택이 팡팡!");
        dig.show();
    }
    public void btnOnClick2(View view) {
        AlertDialog.Builder dig = new AlertDialog.Builder((pg_28_java.this));
        dig.setTitle("매칭이 완료되었습니다!");
        dig.setMessage("김근원님이 매칭을 수락하셨습니다.\n시간 : 04시 29분\n장소 : 도안동 800");
        dig.show();
    }
    public void btnOnClick3(View view) {
        AlertDialog.Builder dig = new AlertDialog.Builder((pg_28_java.this));
        dig.setTitle("(공지사항) V1.5 업데이트 내역");
        dig.setMessage("위치의 정확도를 높였습니다.");
        dig.show();
    }
}