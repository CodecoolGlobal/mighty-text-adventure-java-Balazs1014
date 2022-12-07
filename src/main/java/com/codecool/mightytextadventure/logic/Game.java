package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Game {
    private final Area[] areas;
    private final Input input;
    private final Display display;

    int score = 1000;

    public Game(Area[] areas, Input input, Display display) {
        this.areas = areas;
        this.input = input;
        this.display = display;
    }

    public void run() {
        int triesLeft = 3;
        boolean isRunning = true;
        Player player = new Player(input.getNameFromUser(),areas[0]);
        while (isRunning) {
            display.printMessage(player.currentArea.getDescription());
            display.printMessage(player.currentArea.getQuestion().getQuestion());
            boolean test = input.getAnswerFromUser(player.currentArea.getQuestion().getExpectedAnswer());
            if(test){
                for(int i = 0; i < areas.length; i++) {
                    if(areas[i].equals(player.currentArea)) {
                        if(triesLeft > 0 && i + 1 >= areas.length){
                            isRunning = false;
                            display.printMessage("You won!");
                            display.printMessage("Your score is: " + String.valueOf(score));
                        }
                        else{
                            player.currentArea = areas[i + 1];
                            score += i * 1000;
                            display.printMessage(String.valueOf(score));
                            isRunning = step();
                        }
                        break;
                    }
                }
            }
            else {
                triesLeft--;
                display.printMessage("I am sure you are smarter than this, let's try again! you have " + triesLeft + " tries left!");
            }
            if (triesLeft == 0) {
                isRunning = false;
                display.printMessage("No cookies for you! You died...");
                display.printMessage("Your score is: " + String.valueOf(score));
            }
        }
    }

    private boolean step() {
        return true;
    }
}
