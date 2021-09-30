package by.epamtc.HacakConstantine.task01.ex08;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        int x = Logic.scanInt();
        if (Logic.checkX(x) == 1)
            System.out.println("F(x) = -x^2 + 3x + 9 = " + Logic.findFx(x));
        else
            System.out.println("F(x) = 1 / (x^3 - 6) = " + Logic.findFx(x));
    }
}
