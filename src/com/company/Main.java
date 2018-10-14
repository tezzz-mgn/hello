package com.company;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        Time t = new Time(0, 0, 0);
        int x;
        int step;

        DateTime dt = new DateTime(0,0,0,0,0,0);

        System.out.println("Введите год (1-9999):");
        do {
            x = scanner.nextInt();
        } while (x < 1 || x > 9999);
        dt.setYears(x);

        System.out.println("Введите месяц (1-12):");
        do {
            x = scanner.nextInt();
        } while (x < 1 || x > 12);
        dt.setMonths(x);

        System.out.println("Введите день (1-[28..31]):");
        do {

            x = scanner.nextInt();
        } while (x < 1 || x > dt.getDaysOfMonth(dt.getYears(),dt.getMonths()));
        dt.setDays(x);
        dt.showDate();

        System.out.println("Введите часы (0-23):");
        do {
            x = scanner.nextInt();
        } while (x < 0 || x > 23);
        t.setHours(x);

        System.out.println("Введите минуты (0-59):");
        do {
            x = scanner.nextInt();
        } while (x < 0 || x > 59);
        t.setMinutes(x);

        System.out.println("Введите секунды (0-59):");
        do {
            x = scanner.nextInt();
        } while (x < 0 || x > 59);
        t.setSeconds(x);

        System.out.println("Введите шаг в секундах (может быть отрицательным):");

            step = scanner.nextInt();


        int code;
        //while ( -1 != (code = System.in.read() )
        while (true)
        {
            try {
                System.in.read();
            } catch (Exception e) {}
            t.showTime();
            t.nextS(step);
            //scanner.nextInt();
        }
    }
}
