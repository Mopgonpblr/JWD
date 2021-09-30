package by.epamtc.HacakConstantine.task01.ex02;

import java.util.Scanner;

public class Logic {
    static Scanner sc = new Scanner(System.in);

    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int days(int month, int year) {
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isYearLeap(year))
                    return 29;
                else
                    return 28;
            default: return 0;
        }
    }

    public static int scanYear() {
        int year;
        do {
            while (!sc.hasNextInt()) {
                sc.next();
            }
            year = sc.nextInt();
        }
        while (year > 2021);
        return year;
    }

    public static int scanMonth() {
        int month;
        do {
            while (!sc.hasNextInt()) {
                sc.next();
            }
            month = sc.nextInt();
        } while (month < 1 || month > 12);
        return month;
    }
}
