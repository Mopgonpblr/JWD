package by.epamtc.HacakConstantine.task01.ex07;

import by.epamtc.HacakConstantine.task01.NewScanner;

public class Runner {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        System.out.println("Point A");
        System.out.println("Enter X: ");
        a.setX(NewScanner.scanInt());
        System.out.println("Enter Y: ");
        a.setY(NewScanner.scanInt());
        System.out.println("Point B");
        System.out.println("Enter X: ");
        b.setX(NewScanner.scanInt());
        System.out.println("Enter Y: ");
        b.setY(NewScanner.scanInt());
        Point result=Logic.result(a,b);
        System.out.println("X: "+result.getX()+" Y: "+result.getY()+" is closer");
    }
}
