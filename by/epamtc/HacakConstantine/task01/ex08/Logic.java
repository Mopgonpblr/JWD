package by.epamtc.HacakConstantine.task01.ex08;

import java.util.Scanner;

public class Logic {

    static Scanner sc = new Scanner(System.in);

    public static int scanInt() {
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static int checkX(int x) {
        if (x >= 3)
            return 1;
        else
            return 2;
    }

    public static double findFx(int x) {
        double fx;
        if (checkX(x) == 1)
            fx = -Math.pow(x, 2) + 3 * x + 9;
        else
            fx = 1 / (Math.pow(x, 3) - 6);
        return fx;
    }
}
