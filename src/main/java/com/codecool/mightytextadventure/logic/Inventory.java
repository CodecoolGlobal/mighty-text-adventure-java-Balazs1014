package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Items;

import java.util.ArrayList;

public  class Inventory {

    public ArrayList<String> manageInventory() {
        ArrayList<String> items = new ArrayList<>();
        items.add(String.valueOf(Items.LAPTOP));
        items.add(String.valueOf(Items.NOOBNESS));

        return items;
    }
}
