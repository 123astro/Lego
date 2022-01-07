package com.careerdevs.legoproject;

public class Car {
    public String color;
    public String manufacturer;

    public Car(){
    }

    public Car(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public Car(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public String toString(){
        return "\nColor of car: " + color + "\nThe manufacture of the car: " + manufacturer;
    }


}
