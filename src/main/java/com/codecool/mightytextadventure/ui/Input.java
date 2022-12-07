package com.codecool.mightytextadventure.ui;
import com.codecool.mightytextadventure.logic.NameValidator;

import java.util.Scanner;


public class Input {

    String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public String getNameFromUser(){
        Scanner characterName = new Scanner(System.in);
        Display display = new Display();
        setName(characterName.nextLine());
        NameValidator validator = new NameValidator();
        if (validator.validate(name)) {
            return name;
        } else {
            display.printMessage("Name should consist of a minimum of 3 characters and a maximum of 16.");
            return getNameFromUser();
        }
    }

    public boolean getAnswerFromUser(String answer){
        Scanner scanner = new Scanner(System.in);
        String playerinput = scanner.nextLine();
        return playerinput.toLowerCase().equals(answer.toLowerCase());
    }

}
