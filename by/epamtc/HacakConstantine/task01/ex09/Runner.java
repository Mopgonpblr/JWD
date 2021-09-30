package by.epamtc.HacakConstantine.task01.ex09;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        int r = Logic.scanInt();
        System.out.println("Circle length: " + Logic.findC(r));
        System.out.println("Circle square: " + Logic.findS(r));
    }
}
