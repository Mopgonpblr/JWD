package by.epamtc.HacakConstantine.task02.Model;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {
    private final int maxWeight;
    private int currentWeight;
    private final String type;
    private ArrayList basketObjects=new ArrayList();

    public int getMaxWeight() {
        return maxWeight;
    }


    public String getType() {
        return type;
    }

    public ArrayList getBasketObjects() {
        return basketObjects;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public Basket(int maxWeight, String type) {
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public void add(int weight,Object obj) throws IllegalArgumentException{
        if (this.currentWeight+weight<=maxWeight && Objects.equals(this.type, obj.getClass().getTypeName())){
            basketObjects.add(obj);
            this.currentWeight+=weight;
        }
        else
            throw new IllegalArgumentException(String.format("The balls' weight [%d] exceeds basket's maximum weight [%d].", this.currentWeight+=weight, this.maxWeight));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        if (maxWeight != basket.maxWeight)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.maxWeight;
        return result;
    }


}
