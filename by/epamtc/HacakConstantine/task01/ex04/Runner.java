package by.epamtc.HacakConstantine.task01.ex04;

import by.epamtc.HacakConstantine.task01.NewScanner;

public class Runner {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value: ");
            array[i] = NewScanner.scanInt();
        }
        if (Logic.are2Even(array))
            System.out.println("2 or more numbers are even");
        else
            System.out.println("There's no 2 numbers that are even");
    }
}
