package com.codecool.mightytextadventure.data;

public enum Items {
    LAPTOP(1000),
    NOOBNESS(0),
    SWEAT(1000),
    TISSUE(5000),
    METAL_ACCESS_KEY(10000),
    THIRD_EYE(2500),
    MASTER_KEY(10000);

    Items(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    int points;

}
