package org.example.model;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Weapon extends Item{

    private int minDamage;
    private int maxDamage;

    public Weapon(String itemName, int price, int weight, int minDamage, int maxDamage) {
        super(itemName, price, weight, true);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int attack(){
        return ThreadLocalRandom.current().nextInt(minDamage, maxDamage +1);
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "minDamage=" + minDamage +
                ", maxDamage=" + maxDamage +
                '}';
    }
}
