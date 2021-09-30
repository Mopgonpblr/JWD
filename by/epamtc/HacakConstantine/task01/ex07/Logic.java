package by.epamtc.HacakConstantine.task01.ex07;

import java.util.Scanner;

public class Logic {

    static Scanner sc = new Scanner(System.in);

    public static int scanInt() {
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static double findLength(Point a) {
        return Math.sqrt(Math.pow(a.getX(), 2) + Math.pow(a.getY(), 2));
    }
}
