package org.example;

import org.example.model.Food;
import org.example.model.Item;
import org.example.model.PlayerCharacter;
import org.example.model.Sword;

/**
 * Game Inventory
 * Item - parent
 * Weapon - Weapon in item
 * Sword - Sword is a weapon and item
 *
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PlayerCharacter character = new PlayerCharacter("Jörgen the bear");
        Sword sword = new Sword("longsword", 300, 8, 1, 10, 2);
        Food food = new Food("pasta", 10, 2, 100);

        character.addToInventory(sword);
        character.addToInventory(food);
        character.equipWeapon(0);

        System.out.println(character.attack());

        for (Item item : character.getItems()){
            System.out.println(item);
        }

        food.consume();



    }
}
