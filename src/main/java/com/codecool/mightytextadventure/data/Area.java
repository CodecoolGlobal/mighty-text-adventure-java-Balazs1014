package com.codecool.mightytextadventure.data;

import java.util.List;
import java.util.Random;

public class Area {

    private String description;
    private List<Question> questions;

    public Area(String description, List<Question> questions) {
        this.description = description;
        this.questions = questions;
    }

    public String getDescription() {
        return description;
    }

    public Question getQuestion() {
        Random random = new Random();
        int randnum = random.nextInt(questions.size());
        return questions.get(randnum);
    }
}
