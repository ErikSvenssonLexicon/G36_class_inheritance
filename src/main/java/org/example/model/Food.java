package org.example.model;

public class Food extends Consumable{

    private int energy;

    public Food(String itemName, int price, int weight, int energy) {
        super(itemName, price, weight, false);
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public void consume(){
        System.out.println(getItemName() + " is consumed");
    }

    @Override
    public String toString() {
        return "Food{" +
                "energy=" + energy +
                '}';
    }
}
