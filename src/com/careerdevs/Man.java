package com.careerdevs;

//  include the parent class fields in the constructor and use super

public class Man extends GeneralObject {
    public String name;

    public Man(boolean moves, String color, String name) {
        super(moves, color);
        this.name = name;
    }

    @Override
    public String toString() {
        return "You created a man. What is the man's name? " + name + " Can he walk? " + moves + " What color is his " +
                "uniform ? " + color;
    }
}
