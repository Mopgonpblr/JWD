package by.epamtc.HacakConstantine.task01.ex06;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the number of seconds: ");
        int seconds = Logic.scanInt();
        System.out.println(Logic.findHours(seconds) + ": "
                + Logic.findMinutes(seconds) + ": " + Logic.findSeconds(seconds));
    }
}
