package by.epamtc.HacakConstantine.task02.Model;

import by.epamtc.HacakConstantine.task02.Logic.Color;

public class Ball {
    private int weight;
    private Color color;

    public int getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        if (weight != ball.weight)
            return false;
        if (color != ball.color)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.weight;
        result = prime * result + this.color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "weight='" + weight + '\''
                + ", color=" + color
                + '}';
    }
}
