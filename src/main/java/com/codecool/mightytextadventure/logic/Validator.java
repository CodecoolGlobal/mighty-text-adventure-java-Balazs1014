package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.room.StartRoomManager;
import com.codecool.mightytextadventure.ui.Input;

public class Validator {
    Input scanner = new Input();
    StartRoomManager startRoomManager = new StartRoomManager();
    Area area = new Area("ProgBasics");
    Player player = new Player(scanner.getName(),area);
    public boolean validate(String input) {

        if (input.length() > 3 && input.length() < 16) {
            System.out.println("TRUE");
            player.setName(input);
            scanner.setName(input);
            return true;
        }
        System.out.println("FALSE");
        return false;
    }
}
