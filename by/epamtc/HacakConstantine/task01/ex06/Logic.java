package by.epamtc.HacakConstantine.task01.ex06;

public class Logic {


    public static int findHours(int seconds) {
        return seconds / 3600;
    }

    public static int findMinutes(int seconds) {
        seconds -= findHours(seconds) * 3600;
        return seconds / 60;
    }

    public static int findSeconds(int seconds) {
        seconds = seconds - findMinutes(seconds) * 60 - findHours(seconds) * 3600;
        return seconds;
    }


}
