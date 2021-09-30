package by.epamtc.HacakConstantine.task01.ex10;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        int a = Logic.scanInt();
        System.out.print("Enter b: ");
        int b = Logic.scanInt();
        System.out.print("Enter h: ");
        int h = Logic.scanInt();
        double[] x = Logic.arrayOfArgs(a, b, h);
        double[] y = Logic.arrayOfResults(a, b, h);
        Logic.printTable(x, y);
    }
}
