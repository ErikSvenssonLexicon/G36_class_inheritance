package org.example.model;

public abstract class Consumable extends Item {

    public abstract void consume();

    public Consumable(String itemName, int price, int weight, boolean equipable) {
        super(itemName, price, weight, equipable);
    }
}
