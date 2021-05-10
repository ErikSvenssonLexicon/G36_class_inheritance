package org.example.model;

public class Sword extends Weapon{

    private int modifier;

    public Sword(String itemName, int price, int weight, int minDamage, int maxDamage, int modifier) {
        super(itemName, price, weight, minDamage, maxDamage);
        this.modifier = modifier;
    }

    @Override
    public int attack() {
        return super.attack() + modifier;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "modifier=" + modifier +
                '}';
    }
}
