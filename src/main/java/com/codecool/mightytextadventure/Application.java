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
        startRoomManager.StartRoomTextOutputHandler("Please input your name (min. 3 characters, max 16 characters): ");


        Area[] areas = loadAreas();

        Game game = new Game(areas, input, display);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    public static Area[] loadAreas(){
        Area[] areas =   new Area[11];
        areas[0] = new Area("Start room", List.of(new Question("How much is 16 * 4?", "64")));
        areas[1] = new Area("Room 1", List.of(new Question("How much is 594 / 6", "99")));
        areas[2] = new Area("Room 2", List.of(new Question("How many megabytes are in a gigabyte?", "1024")));
        areas[3] = new Area("Room 3", List.of(new Question("Which was the first language which implemented true OOP rules?", "Simula")));
        areas[4] = new Area("Room 4", List.of(new Question("What does MERN stand for", "mongodb, express, react, nodejs")));
        areas[5] = new Area("Room 5", List.of(new Question("What powers a developer?", "coffee")));
        areas[6] = new Area("Room 6", List.of(new Question("What was Java originally called?", "Oak")));
        areas[7] = new Area("Room 7", List.of(new Question("Who is the founder of Java programming language?", "James Gosling")));
        areas[8] = new Area("Room 8", List.of(new Question("In what year did Java first appear?", "1995")));
        areas[9] = new Area("Room 9", List.of(new Question("IntelliJ Idea is a text editor. True or false?", "False")));
        areas[10] = new Area("Room 10", List.of(new Question("What does JVM stand for?", "Java Virtual Machine")));
        return areas;
    }
}
