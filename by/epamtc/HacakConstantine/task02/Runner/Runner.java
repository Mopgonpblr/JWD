package by.epamtc.HacakConstantine.task02.Runner;

import by.epamtc.HacakConstantine.task02.Logic.*;
import by.epamtc.HacakConstantine.task02.Model.*;

public class Runner {
    public static void main(String[] args) {
        Basket basket=new Basket(12,Ball.class.getTypeName());
        Ball ball1= new Ball(1, Color.RED);
        basket.add(ball1.getWeight(),ball1);
        Ball ball2= new Ball(5, Color.BLUE);
        basket.add(ball2.getWeight(),ball2);
        Ball ball3= new Ball(10, Color.BLACK);
        //basket.add(ball3.getWeight(),ball3);
        System.out.println("Weight:"+ basket.getCurrentWeight());
        System.out.println("Blue balls: "+ Logic.countBalls(Color.BLUE, basket.getBasketObjects()));
    }
}
