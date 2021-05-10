package org.example.model;

import java.util.List;

public class PlayerCharacter {
    private String name;
    private Weapon equipped;

    private Inventory inventory;

    public PlayerCharacter(String name) {
        this.name = name;
        inventory = new Inventory();
    }

    public int attack(){
        if(hasWeaponEquipped()){
            return equipped.attack();
        }else{
            return 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToInventory(Item item){
        inventory.addToInventory(item);
    }

    public boolean hasWeaponEquipped(){
        return equipped != null;
    }

    public void equipWeapon(int index){
        equipped = inventory.equipFromInventory(index);
    }

    public List<Item> getItems() {
        return inventory.getItems();
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
