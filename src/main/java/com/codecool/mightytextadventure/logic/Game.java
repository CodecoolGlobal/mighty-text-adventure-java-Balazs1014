package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Game {
    private final Area[] areas;
    private final Input input;
    private final Display display;

    public Game(Area[] areas, Input input, Display display) {
        this.areas = areas;
        this.input = input;
        this.display = display;
    }

    public void run() {
        boolean isRunning = true;
        Player player = new Player(input.getNameFromUser(),areas[0]);
        while (isRunning) {
            display.printMessage(player.currentArea.getDescription());
            display.printMessage(player.currentArea.getQuestion().getQuestion());
            boolean test = input.getAnswerFromUser(player.currentArea.getQuestion().getExpectedAnswer());
            if(test){
                for(int i = 0; i < areas.length; i++) {
                    if(areas[i].equals(player.currentArea)) {
                        if(i + 1 >= areas.length){
                            isRunning = false;
                        }
                        else{
                            player.currentArea = areas[i + 1];
                            isRunning = step();
                        }
                        break;
                    }
                }
            }
        }
    }

    private boolean step() {
        display.printMessage("Steps");
        return true;
    }
}
