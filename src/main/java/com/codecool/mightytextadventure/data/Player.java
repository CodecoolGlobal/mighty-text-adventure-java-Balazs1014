package com.codecool.mightytextadventure.data;

import com.codecool.mightytextadventure.Application;
import com.codecool.mightytextadventure.ui.Input;

import java.util.List;

public class Player {
    public String name;
    public List<Items> inventory;
    public Area currentArea;
    public int points;

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name, Area currentArea) {
        this.name = name;
        this.currentArea = currentArea;

        //inventory.add(Items.LAPTOP);
        //inventory.add(Items.NOOBNESS);
        points = 0;

        Application application = new Application();
        Area[] areas = application.loadAreas();
        currentArea = areas[0];
    }

    public void removeFromInventory(Items item) {
        inventory.remove(item);
    }

    public void addToInventory(Items item) {
        inventory.add(item);
    }

    public void setPlayerName(String name) {
        Input input = new Input();
        Area area = new Area("Start Room");
        Player player = new Player(name, area);
        player.setName(input.getName());
    }

    public String getName() {
        return name;
    }
}
