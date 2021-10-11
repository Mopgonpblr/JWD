package by.epamtc.HacakConstantine.task01.ex10;

public class Logic {

    public static double findFx(int x) {
        return Math.tan(x);
    }

    public static double[] arrayOfArgs(int a, int b, int h) {
        int size;
        double[] x;
        if (a<b && h>0)
            size=(b - a) / h +1;
        else if (a>b && h<0)
            size=(a - b) / Math.abs(h) +1;
        else
            return null;
        x = new double[size];
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
}
