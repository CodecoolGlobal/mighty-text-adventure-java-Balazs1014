package com.codecool.mightytextadventure.room;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.logic.ChangeRoom;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class StartRoomManager {
    Display display = new Display();
    ChangeRoom changeRoom = new ChangeRoom();
    Input input = new Input();
    public void StartRoomTextOutputHandler(String message){
        display.printMessage(message);
    }

    public void ProceedToNextRoom(int id){
       changeRoom.progressToNextRoom(id);
    }

    public void InputPlayerName(){
        input.getNameFromUser();
    }
}
