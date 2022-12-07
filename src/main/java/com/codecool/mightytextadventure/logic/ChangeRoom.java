package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.Application;
import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.ui.Input;

public class ChangeRoom {

    public void progressToNextRoom(int roomNo) {
        Input input = new Input();
        Application application = new Application();
        Area[] areas =  application.loadAreas();
        Player player = new Player(input.getName(), areas[roomNo]);
    }
}
