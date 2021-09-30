package by.epamtc.HacakConstantine.task01.ex07;

public class Runner {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        System.out.println("Point A");
        System.out.println("Enter X: ");
        a.setX(Logic.scanInt());
        System.out.println("Enter Y: ");
        a.setY(Logic.scanInt());
        System.out.println("Point B");
        System.out.println("Enter X: ");
        b.setX(Logic.scanInt());
        System.out.println("Enter Y: ");
        b.setY(Logic.scanInt());
        if (Logic.findLength(a) < Logic.findLength(b))
            System.out.println("Point A is closer to the origin");
        else if (Logic.findLength(b) < Logic.findLength(a))
            System.out.println("Point B is closer to the origin");
        else
            System.out.println("The points are equally far from the origin");
    }
}
