package com.careerdevs;

// include the parent class fields in the constructor and use super

public class Kart extends GeneralObject {
    public String manufacturer;

    public Kart(boolean moves, String manufacturer, String color) {
        super(moves, color);
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Who is the manufacture? " + manufacturer + " Does the kart move? " + moves + " What color is the " +
                "kart? " + color;
    }
}
