package com.careerdevs;

//parent class  - all child classes will use the fields in this class. super() is used in the child class constructors.
// The child class constructor has the fields of the parent class.

public class GeneralObject {
    public boolean moves;
    public String color;

    public GeneralObject(boolean moves, String color) {
        this.moves = moves;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Does the object move? " + moves + " What color is the object? " + color;
    }
}
