package by.epamtc.HacakConstantine.task01.ex02;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter the month: ");
        int month = Logic.scanMonth();
        System.out.print("Enter the year: ");
        int year = Logic.scanYear();
        System.out.println("The number of days in the month is " + Logic.days(month, year));
        if (Logic.isYearLeap(year))
            System.out.println("The year is leap");
        else
            System.out.println("The year isn't leap");
    }
}
