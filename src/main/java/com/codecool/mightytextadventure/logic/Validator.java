package com.codecool.mightytextadventure.logic;

public class Validator {

    public boolean validate(String input) {
        if (input.length() > 3 && input.length() < 16) {
            return true;
        }
        return false;
    }
}
