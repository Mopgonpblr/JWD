package by.epamtc.HacakConstantine.task01.ex10;

import by.epamtc.HacakConstantine.task01.NewScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        int a = NewScanner.scanInt();
        System.out.print("Enter b: ");
        int b = NewScanner.scanInt();
        System.out.print("Enter h: ");
        int h = NewScanner.scanInt();
        double[] x = Logic.arrayOfArgs(a, b, h);
        double[] y = Logic.arrayOfResults(a, b, h);
        System.out.println("X | F(x)");
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i] + " " + y[i]);
    }
}
