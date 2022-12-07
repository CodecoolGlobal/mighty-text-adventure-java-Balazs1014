package com.codecool.mightytextadventure.data;

public class Question {
    private String question;
    private String expectedAnswer;

    public String getQuestion() {
        return question;
    }

    public String getExpectedAnswer() {
        return expectedAnswer;
    }

    public Question(String question, String expectedAnswer) {
        this.question = question;
        this.expectedAnswer = expectedAnswer;
    }
}
