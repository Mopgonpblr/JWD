package by.epamtc.HacakConstantine.task01.ex10;

import java.util.Scanner;

public class Logic {
    static Scanner sc = new Scanner(System.in);

    public static int scanInt() {
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static double findFx(int x) {
        return Math.tan(x);
    }

    public static double[] arrayOfArgs(int a, int b, int h) {
        double[] x = new double[(b + a) / h];
        for (int i = 0; i < x.length; i++) {
            x[i] = a;
            a += h;
        }
        return x;
    }

    public static double[] arrayOfResults(int a, int b, int h) {
        double[] y = new double[(b + a) / h];
        for (int i = 0; i < y.length; i++) {
            y[i] = findFx(a);
            a += h;
        }
        return y;
    }

    public static void printTable(double[] x, double[] y) {
        System.out.println("X | F(x)");
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i] + " " + y[i]);
    }
}
