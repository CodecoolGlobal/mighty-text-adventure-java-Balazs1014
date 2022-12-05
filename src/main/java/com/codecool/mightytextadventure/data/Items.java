package com.codecool.mightytextadventure.data;

public enum Items {
    LAPTOP(1000),
    NOOBNESS(1000),
    SWEAT(1000),
    TISSUE(1000),
    METAL_ACCESS_KEY(10000),
    THIRD_EYE(1000),
    MASTER_KEY(10000);

    private int points;

    Items(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
