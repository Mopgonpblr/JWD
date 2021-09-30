package by.epamtc.HacakConstantine.task01.ex09;

import java.util.Scanner;

public class Logic {
    static Scanner sc = new Scanner(System.in);

    public static int scanInt() {
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static double findC(int r) {
        return 2 * Math.PI * r;
    }

    public static double findS(int r) {
        return Math.PI * Math.pow(r, 2);
    }

}
