package by.epamtc.HacakConstantine.task01.ex06;

import by.epamtc.HacakConstantine.task01.NewScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the number of seconds: ");
        int seconds = NewScanner.scanSeconds();
        System.out.println(Logic.findHours(seconds) + ": "
                + Logic.findMinutes(seconds) + ": " + Logic.findSeconds(seconds));
    }
}
