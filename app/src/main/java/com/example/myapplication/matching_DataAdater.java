package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class matching_DataAdater extends BaseAdapter {
    ArrayList<matching_Data> matching; LayoutInflater inflater;
    public matching_DataAdater(LayoutInflater inflater, ArrayList<matching_Data> datas) {
        this.matching= datas;
        this.inflater= inflater;
    }

    @Override public int getCount() {
        // TODO Auto-generated method stub
        return matching.size();
    }

    @Override public Object getItem(int position) {
        // TODO Auto-generated method stub
        return matching.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        if( convertView==null){
            convertView= inflater.inflate(R.layout.list_matching, null);
        }
        TextView text_name= (TextView)convertView.findViewById(R.id.name);
        TextView text_gender= (TextView)convertView.findViewById(R.id.gender);
        TextView start= (TextView)convertView.findViewById(R.id.start);
        TextView end = (TextView)convertView.findViewById(R.id.end);
        TextView etc = (TextView)convertView.findViewById(R.id.etc);
        TextView month = (TextView)convertView.findViewById(R.id.month);
        TextView day = (TextView)convertView.findViewById(R.id.day);
        TextView time = (TextView)convertView.findViewById(R.id.time);
        ImageView getImg= (ImageView)convertView.findViewById(R.id.profile_img);

        text_name.setText( matching.get(position).getName() );
        text_gender.setText( matching.get(position).getGender() );
        start.setText( matching.get(position).getStart() );
        end.setText( matching.get(position).getEnd() );
        month.setText( matching.get(position).getMonth() );
        day.setText( matching.get(position).getDay() );
        time.setText( matching.get(position).getTime() );
        etc.setText( matching.get(position).getEtc() );
        getImg.setImageResource( matching.get(position).getProfile_img() );
        return convertView;
    }
}
