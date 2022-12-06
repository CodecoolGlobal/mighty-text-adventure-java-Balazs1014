package com.codecool.mightytextadventure.logic;

import java.util.Arrays;
import java.util.List;

public class GenerateQuestion {
    public String question(){
        List<String> questions = Arrays.asList("How much is 1 + 1?", "How much is 2 + 2?");
        return questions.get(0);
    }
}
