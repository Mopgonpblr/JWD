package by.epamtc.HacakConstantine.task01.ex03;

import java.util.Scanner;

public class Logic {
    static Scanner sc = new Scanner(System.in);

    public static double scanDouble() {
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        return sc.nextDouble();
    }

    public static double findD(double square) {
        return Math.sqrt(square);
    }

    public static double findInsideS(double d) {
        return Math.pow(d, 2) / 2;
    }

    public static double findDifference(double sOutside, double sInside) {
        return sOutside / sInside;
    }
}
