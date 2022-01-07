package com.careerdevs.legoproject;

public class Car {
    public String color;
    public String manufacturer;

    public Car(){}

    public Car(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public Car(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String toString(){
        return "Color of car: " + color + " The manufacture of the car: " + manufacturer;
    }
}
