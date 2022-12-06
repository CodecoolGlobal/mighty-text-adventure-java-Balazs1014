package com.codecool.mightytextadventure.data;

public enum Question {
    QUESTION1("How much 1 + 1?"),
    QUESTION2("How much 1 + 2?");

    private String question;

    Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
}
