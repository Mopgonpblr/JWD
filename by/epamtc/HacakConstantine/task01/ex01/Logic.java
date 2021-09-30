package by.epamtc.HacakConstantine.task01.ex01;
import java.util.Scanner;

public class Logic {
    static Scanner sc = new Scanner(System.in);

    public static int lastDigit(int value){
        return value % 10;
    }
    public static int square(int value) {
        return (int)Math.pow(value,2);
    }
    public static int scanInt(){
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }
}
