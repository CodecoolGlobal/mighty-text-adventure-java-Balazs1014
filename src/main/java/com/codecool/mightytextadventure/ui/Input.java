package com.codecool.mightytextadventure.ui;
import com.codecool.mightytextadventure.logic.AnswerValidator;
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
        setName(characterName.nextLine());
        NameValidator validator = new NameValidator();
        return validator.validate(name) ?  name : getNameFromUser();
    }

    public boolean getAnswerFromUser(String answer){
        Scanner scanner = new Scanner(System.in);
        String playerinput = scanner.nextLine();
        return playerinput.toLowerCase().equals(answer.toLowerCase());
    }

}
