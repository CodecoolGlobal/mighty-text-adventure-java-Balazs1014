package com.codecool.mightytextadventure.data;

import com.codecool.mightytextadventure.Application;
import com.codecool.mightytextadventure.ui.Input;

import java.util.List;

public class Player {
    public String name;
    public Area currentArea;
    public int points;

    public Player(String name, Area currentArea) {
        this.name = name;
        this.currentArea = currentArea;
        points = 0;
        Application application = new Application();
        Area[] areas = application.loadAreas();
        currentArea = areas[0];
    }

    public void setPlayerName(String name) {
        Input input = new Input();
        this.name = input.getName();
    }

    public String getName() {
        return name;
    }
}
