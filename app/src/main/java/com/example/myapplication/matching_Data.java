package com.example.myapplication;

public class matching_Data {

    String name;     //이름
    String gender;   // 성별
    String start;    // 출발지
    String end;      // 도착지
    String month;       // 월
    String day;         // 일
    String time;        // 시간
    String etc;      // 요구사항
    int profile_img; // 프로필 사진

    public matching_Data(String name, String gender, String start, String end, String month, String day, String time, String etc, int profile_img) {
        this.name = name;
        this.gender = gender;
        this.start = start;
        this.end = end;
        this.month = month;
        this.day = day;
        this.time = time;
        this.etc = etc;
        this.profile_img = profile_img;

    }


    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void profile_img(int profile_img) {
        this.profile_img = profile_img;
    }


    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    //------------------------------------

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public int getProfile_img()
    {
        return profile_img;
    }


    public String getStart()
    {
        return start;
    }

    public String getEnd()
    {
        return end;
    }

    public String getMonth()
    {
        return month;
    }

    public String getDay ()
        {
        return day;
        }

    public String getTime()
        {
        return time;
        }

    public String getEtc()
    {
        return etc;
    }
}



