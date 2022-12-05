package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class Input {

    public String getInputFromUser(){
        Scanner characterName = new Scanner(System.in);
        String input = characterName.nextLine();
        return input;
    }

}
