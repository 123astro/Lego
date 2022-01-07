package com.careerdevs.inheritance;

// include the parent class fields in the constructor and use super


public class Alien extends GeneralObject {
    public String planet;

    public Alien(boolean moves, String planet, String color) {
        super(moves, color);
        this.planet = planet;
    }

    @Override
    public String toString() {
        return "What plant is this object from? " + planet + " Does this object move? " + moves + " What color is the" +
                " " +
                "object? " + color;
    }
}
