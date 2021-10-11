package by.epamtc.HacakConstantine.task01.ex07.Test;

import by.epamtc.HacakConstantine.task01.ex07.Logic;
import by.epamtc.HacakConstantine.task01.ex07.Point;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void findLength_point_default() {
        Point a=new Point();
        double expected=0;
        double actual=Logic.findLength(a);
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void result_point_zero() {
        Point a=new Point(0,0);
        Point b=new Point(0,0);
        Point expected=b;
        Point actual=Logic.result(a,b);
        Assert.assertEquals(expected,actual);
    }
}
