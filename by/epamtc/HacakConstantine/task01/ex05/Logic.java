package by.epamtc.HacakConstantine.task01.ex05;

import java.util.Scanner;

public class Logic {
    static Scanner sc = new Scanner(System.in);

    public static int scanInt() {
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static boolean canDivide(int value, int divider) {
        return value % divider == 0;
    }

    public static int countDividerSum(int value) {
        int count = 0;
        for (int i = 1; i < value; i++) {
            if (canDivide(value, i))
                count += i;
        }
        return count;
    }

    public static boolean isPerfect(int a) {
        return a == countDividerSum(a);
    }
}
