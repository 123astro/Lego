package com.careerdevs.inheritance;

//  include the parent class fields in the constructor and use super

public class Man extends Human {

    public Man(boolean moves, String color, String name) {
        super(moves, color, name);
    }
}
