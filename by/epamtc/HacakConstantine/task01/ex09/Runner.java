package by.epamtc.HacakConstantine.task01.ex09;

import by.epamtc.HacakConstantine.task01.NewScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        int r = NewScanner.scanInt();
        System.out.println("Circle length: " + Logic.findC(r));
        System.out.println("Circle square: " + Logic.findS(r));
    }
}
