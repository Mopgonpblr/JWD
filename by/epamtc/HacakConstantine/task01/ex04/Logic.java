package by.epamtc.HacakConstantine.task01.ex04;

public class Logic {

    public static boolean checkEven(int value) {
        return value % 2 == 0;
    }

    public static int countEven(int... a) {
        int count = 0;
        for (int value : a) {
            if (checkEven(value))
                count++;
        }
        return count;
    }

    public static boolean are2Even(int... a) {
        return countEven(a) >= 2;
    }
}
