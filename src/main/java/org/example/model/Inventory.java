package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addToInventory(Item item){
        items.add(item);
    }

    public Weapon equipFromInventory(int index){
        Item item = items.get(index);
        if(item instanceof Weapon){
            return (Weapon) item;
        }else{
            throw new IllegalArgumentException("Can't equip " + item.getItemName());
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
