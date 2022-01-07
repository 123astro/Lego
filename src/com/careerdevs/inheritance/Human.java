package com.careerdevs.inheritance;

public class Human extends GeneralObject {
    public String name;

    public Human(boolean moves, String color, String name) {
        super(moves, color);
        this.name = name;
    }

    @Override
    public String toString() {
        return "You created a human. What is the human's name? " + name + " Can they walk? " + moves + " What color " +
                "is " + "uniform ? " + color;
    }
}