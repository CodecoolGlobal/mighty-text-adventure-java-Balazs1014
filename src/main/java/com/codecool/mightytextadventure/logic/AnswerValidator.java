package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.room.StartRoomManager;
import com.codecool.mightytextadventure.ui.Input;

import java.util.List;

public class AnswerValidator {
    public boolean validate(String input, String expected) {
        return input.toLowerCase().equals(expected.toLowerCase());
    }
}
