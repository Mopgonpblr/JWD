package by.epamtc.HacakConstantine.task01.ex01;


import by.epamtc.HacakConstantine.task01.NewScanner;

/**
 * 1. Написать  программу,  позволяющую  по
 * последней  цифре  числа  определить  последнюю  цифру  его
 * квадрата.
 */
public class Exercise01 {

    public static void main(String[] args) {
        System.out.println("Enter the value: ");
        int value = NewScanner.scanInt();
        value = Logic.lastDigit(Logic.square(Logic.lastDigit(value)));
        System.out.println("The last digit of the number square is " + value);
    }
}
