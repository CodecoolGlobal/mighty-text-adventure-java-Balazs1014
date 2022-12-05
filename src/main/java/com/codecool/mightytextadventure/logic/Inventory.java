package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Items;
import com.codecool.mightytextadventure.data.Player;

public  class Inventory {
    Player player = new Player();

    public void initializeInventoryOnCharacterCreation() {
        player.inventory.add(Items.LAPTOP);
        player.inventory.add(Items.NOOBNESS);
    }

    public void removeFromInventory(Items item) {

        player.inventory.remove(item);
    }

    public void addToInventory(Items item) {

        player.inventory.add(item);
    }
}

