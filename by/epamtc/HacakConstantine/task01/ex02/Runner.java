package by.epamtc.HacakConstantine.task01.ex02;

import by.epamtc.HacakConstantine.task01.NewScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter the month: ");
        int month = NewScanner.scanMonth();
        System.out.print("Enter the year: ");
        int year = NewScanner.scanYear();
        System.out.println("The number of days in the month is " + Logic.days(month, year));
        System.out.println(Logic.result(year));
    }
}
