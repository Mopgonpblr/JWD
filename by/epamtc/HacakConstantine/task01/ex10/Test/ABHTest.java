package by.epamtc.HacakConstantine.task01.ex10.Test;

import by.epamtc.HacakConstantine.task01.ex10.Logic;
import org.junit.Assert;
import org.junit.Test;

public class ABHTest {
    @Test
    public void arrayOfArgs_A_more_than_B_H_negative() {
        double[] expected={20,18,16,14,12,10};
        double[] actual= Logic.arrayOfArgs(20,10,-2);
        for (int i = 0; i < actual.length; i++)
            System.out.println(actual[i]);
        for (int i = 0; i < actual.length; i++)
            Assert.assertEquals(expected[i],actual[i],0);
    }
    @Test
    public void arrayOfArgs_A_less_than_B_H_positive() {
        double[] expected={10.0,12.0,14.0,16.0,18.0,20.0};
        double[] actual= Logic.arrayOfArgs(10,20,2);
        for (int i = 0; i < actual.length; i++)
            Assert.assertEquals(expected[i],actual[i],0);
    }
    @Test
    public void arrayOfArgs_A_more_than_B_H_positive() {
        double[] actual= Logic.arrayOfArgs(20,10,2);
        Assert.assertNull(actual);
    }

    @Test
    public void arrayOfArgs_A_less_than_B_H_negative() {
        double[] actual= Logic.arrayOfArgs(10,20,-2);
        Assert.assertNull(actual);
    }
    @Test
    public void arrayOfArgs_A_less_than_B_H_zero() {
        double[] actual= Logic.arrayOfArgs(10,20,0);
        Assert.assertNull(actual);
    }

    @Test
    public void arrayOfArgs_A_equals_B_H_positive() {
        double[] actual= Logic.arrayOfArgs(10,10,1);
        Assert.assertNull(actual);
    }
}
