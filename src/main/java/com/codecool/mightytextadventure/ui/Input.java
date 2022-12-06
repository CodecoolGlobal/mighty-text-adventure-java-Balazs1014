package com.codecool.mightytextadventure.ui;
import com.codecool.mightytextadventure.logic.Validator;

import java.util.Scanner;


public class Input {
    String name;

    public String getName() {
        return name;
    }

    public String getNameFromUser(){
        Scanner characterName = new Scanner(System.in);
        name = characterName.nextLine();
        Validator validator = new Validator();
        return validator.validate(name) ?  name : getNameFromUser();
    }
}
