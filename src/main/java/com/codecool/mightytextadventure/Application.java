package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.logic.GenerateQuestion;
import com.codecool.mightytextadventure.room.StartRoomManager;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();
        StartRoomManager startRoomManager = new StartRoomManager();

        display.printMessage("Starting Mighty Text Adventure!");
        startRoomManager.StartRoomTextOutputHandler("Please input your name: ");
        Area area = new Area("Room 1");
        Player player = new Player(input.getNameFromUser(),area);
        startRoomManager.StartRoomTextOutputHandler(player.getName());
        GenerateQuestion generateQuestion = new GenerateQuestion();
        startRoomManager.StartRoomTextOutputHandler(generateQuestion.question());
        startRoomManager.InputPlayerName();


        Area[] areas = loadAreas();

        Game game = new Game(areas, input, display);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    public static Area[] loadAreas(){
        Area[] areas =   new Area[7];
        areas[0] = new Area("Start room");
        areas[1] = new Area("Room 1");
        areas[2] = new Area("Room 2");
        areas[3] = new Area("Room 3");
        areas[4] = new Area("Room 4");
        areas[5] = new Area("Room 5");
        areas[6] = new Area("Room 6");
        return areas;
    }
}
