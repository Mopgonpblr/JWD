package by.epamtc.HacakConstantine.task02.Logic;

import by.epamtc.HacakConstantine.task02.Model.Ball;

import java.util.ArrayList;

public class Logic {
    public static int countBalls (Color color, ArrayList arrayList){
        int count=0;
        for (Object o : arrayList) {
            Ball ball = (Ball) o;
            if (ball.getColor() == color)
                count++;
        }
        return count;
    }
}
