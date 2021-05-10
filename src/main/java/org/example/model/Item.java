package org.example.model;

public abstract class Item {

    private String itemName;
    private int price;
    private int weight;
    private boolean equipable;

    public Item(String itemName, int price, int weight, boolean equipable) {
        this.itemName = itemName;
        this.price = price;
        this.weight = weight;
        this.equipable = equipable;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isEquipable() {
        return equipable;
    }

    public void setEquipable(boolean equipable) {
        this.equipable = equipable;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", equipable=" + equipable +
                '}';
    }
}
