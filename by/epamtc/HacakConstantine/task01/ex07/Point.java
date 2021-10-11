package by.epamtc.HacakConstantine.task01.ex07;

import by.epamtc.HacakConstantine.task02.Model.Basket;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Point point = (Point) o;
        if (x != point.x)
            return false;
        if (y != point.y)
            return false;
        return true;
    }
    public String toString() {
        return "X: " + this.x + "Y: " + this.y;
    }


}
