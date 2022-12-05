package com.codecool.mightytextadventure.data;

import java.util.List;

public class Player {
    public String name;
    public List<Items> inventory;
    public Area currentArea;
    public int points;

    public Player(String name, Area currentArea) {
        this.name = name;
        this.currentArea = currentArea;

        inventory.add(Items.LAPTOP);
        inventory.add(Items.NOOBNESS);
        points = 0;
    }

    public void removeFromInventory(Items item) {
        inventory.remove(item);
    }

    public void addToInventory(Items item) {
        inventory.add(item);
    }
}
