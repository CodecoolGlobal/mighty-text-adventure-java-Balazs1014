package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Items;
import java.util.List;

public class ProgBasics {

    public int calculateScore(List<Items> Inventory){
        int result = 0;
        for (Items items : Inventory) {
            result += items.getPoints();
        }
        return result;
    }

}
