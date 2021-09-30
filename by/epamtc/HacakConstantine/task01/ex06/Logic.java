package by.epamtc.HacakConstantine.task01.ex06;

import java.util.Scanner;

public class Logic {
    static Scanner sc = new Scanner(System.in);

    public static int findHours(int seconds) {
        return seconds / 3600;
    }

    public static int findMinutes(int seconds) {
        seconds -= findHours(seconds) * 3600;
        return seconds / 60;
    }

    public static int findSeconds(int seconds) {
        seconds = seconds - findMinutes(seconds) * 60 - findHours(seconds) * 3600;
        return seconds;
    }

    public static int scanInt() {
        int seconds;
        do {
            while (!sc.hasNextInt()) {
                sc.next();
            }
            seconds = sc.nextInt();
        } while (seconds > 86400 || seconds < 1);
        return seconds;
    }
}
