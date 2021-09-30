package by.epamtc.HacakConstantine.task01.ex05;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the value: ");
        int a = Logic.scanInt();
        if (Logic.isPerfect(a))
            System.out.println("The value is perfect");
        else
            System.out.println("The value isn't perfect");
    }
}
