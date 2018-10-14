package com.company;

public class DateTime extends Time {
   private int years;
   private int months;
   private int days;

   public DateTime(int y, int mo, int d, int h, int m, int s){
       super (h, m, s);
       years =y;
       months = mo;
       days =d;
   }

    public int getYears() {
        return years;
    }

    public int getMonths() {
        return months;
    }

    public int getDays() {
        return days;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void nextYear (int stepY){
       years=years+stepY;
    }
    public void nextMonth (int stepM){
        months=months+stepM;
    }
    public void nextDay (int stepD){
        days=days+stepD;
    }
    public int getDaysOfMonth(int y, int m){
       int dd = 0;
       switch (m){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               dd=31;
           case 4:
           case 6:
           case 9:
           case 11:
               dd=30;
           case 2:
               if ((y%4==0 && y%100>0)|| y%400==0) dd=29; else dd=28;

       }
       return dd;
    }

    public void showDate(){
        String addD = "";
        String addM = "";
        if (days < 10) addD = "0";
        if (months < 10) addM = "0";
        System.out.println(addD + days + "." + addM + months + "." + years);
    }


}
