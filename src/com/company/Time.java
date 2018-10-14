package com.company;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int h, int m, int s){
        seconds=s;
        minutes=m;
        hours=h;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() { return seconds;  }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void nextH(){
        if(hours<23) hours++;
    }

    public void prevH(){
        if(hours>0) hours--;
    }

    public void nextM() {
        if (minutes <59) minutes++;
        else {minutes=0; nextH();}
    }
    public void prevM() {
        if (minutes >0) minutes--;
        else {minutes=59; prevH();}
    }
    public void nextS(int step){
        seconds=seconds+step;
        while (seconds>59) {seconds=seconds-60; nextM();}
        while (seconds<0){seconds=seconds+60; prevM();}
    }

    public void showTime(){
        String addH = "";
        String addM = "";
        String addS = "";
        if (hours < 10) addH = "0";
        if (minutes < 10) addM = "0";
        if (seconds < 10) addS = "0";
        System.out.println(addH + hours + ":" + addM + minutes + ":" + addS + seconds);
    }

}
