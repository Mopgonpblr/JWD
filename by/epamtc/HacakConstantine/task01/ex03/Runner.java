package by.epamtc.HacakConstantine.task01.ex03;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter the outside square area: ");
        double sOutside = Logic.scanDouble();
        double sInside = Logic.findInsideS(Logic.findD(sOutside));
        System.out.println("The inside square area is " + sInside);
        System.out.println("The areas differ by " + Logic.findDifference(sOutside, sInside) + " times");
    }
}
