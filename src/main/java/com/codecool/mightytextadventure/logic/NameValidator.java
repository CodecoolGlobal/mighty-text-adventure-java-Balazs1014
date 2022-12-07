package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.room.StartRoomManager;
import com.codecool.mightytextadventure.ui.Input;

import java.util.List;

public class NameValidator {
    public boolean validate(String input) {

        if (input.length() > 3 && input.length() < 16) {
            return true;
        }
        return false;
    }
}
