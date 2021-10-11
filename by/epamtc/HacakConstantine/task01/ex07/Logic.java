package by.epamtc.HacakConstantine.task01.ex07;

public class Logic {

    public static double findLength(Point a) {
        return Math.sqrt(Math.pow(a.getX(), 2) + Math.pow(a.getY(), 2));
    }

    public static Point result(Point a,Point b){
        if (Logic.findLength(a) < Logic.findLength(b))
            return a;
        else
            return b;
    }
}
