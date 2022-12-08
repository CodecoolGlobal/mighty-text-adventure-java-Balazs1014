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
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        String ANSI_RESET = "\u001B[0m";
        int triesLeft = 3;
        boolean isRunning = true;
        Player player = new Player(input.getNameFromUser(),areas[0]);
        while (isRunning) {
            display.printMessage(player.name + ", you are currently in: " + player.currentArea.getDescription() + ".");
            display.printMessage(ANSI_RED_BACKGROUND + player.currentArea.getQuestion().getQuestion() + ANSI_RESET);
            boolean test = input.getAnswerFromUser(player.currentArea.getQuestion().getExpectedAnswer());
            if(test){
                for(int i = 0; i < areas.length; i++) {
                    if(areas[i].equals(player.currentArea)) {
                        if(triesLeft > 0 && i + 1 >= areas.length){
                            isRunning = false;
                            display.printMessage("You won!");
                            display.printMessage("Your final score is: " + String.valueOf(score));
                        }
                        else{
                            player.currentArea = areas[i + 1];
                            score += i * 1000;
                            display.printMessage("");
                            display.printMessage(player.name +", your current score is: " + String.valueOf(score) + "\n");
                            isRunning = step();
                        }
                        break;
                    }
                }
            }
            else {
                triesLeft--;
                score = score / 2;
                display.printMessage("I am sure you are smarter than this, let's try again! you have " + triesLeft + " tries left and your new score is: " + score + "!" );
            }
            if (triesLeft == 0) {
                isRunning = false;
                display.printMessage("No cookies for you! You died...");
                display.printMessage("Your final score is: " + String.valueOf(score));
            }
        }
    }

    private boolean step() {
        return true;
    }
}
