package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.data.Question;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.logic.GenerateQuestion;
import com.codecool.mightytextadventure.room.StartRoomManager;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();
        StartRoomManager startRoomManager = new StartRoomManager();

        display.printMessage("Starting Mighty Text Adventure!");
        startRoomManager.StartRoomTextOutputHandler("Please input your name: ");


        Area[] areas = loadAreas();

        Game game = new Game(areas, input, display);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    public static Area[] loadAreas(){
        Area[] areas =   new Area[7];
        areas[0] = new Area("Start room", List.of(new Question("How much is 1 + 1?", "2")));
        areas[1] = new Area("Room 1", List.of(new Question("what is love?", "baby don't hurt me.")));
        areas[2] = new Area("Room 2", List.of(new Question("How much is 1 + 1?", "2")));
        areas[3] = new Area("Room 3", List.of(new Question("How much is 1 + 1?", "2")));
        areas[4] = new Area("Room 4", List.of(new Question("How much is 1 + 1?", "2")));
        areas[5] = new Area("Room 5", List.of(new Question("How much is 1 + 1?", "2")));
        areas[6] = new Area("Room 6", List.of(new Question("How much is 1 + 1?", "2")));
        return areas;
    }
}
