package com.careerdevs.legoproject;

public class SaloonCar extends Car{
    public int numberOfSeats;

    public SaloonCar(String color, String manufacturer, int numberOfSeats) {
        super(color, manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(String manufacturer, int numberOfSeats){
        super(manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public String toString(){
        return "Color of car: " + color + "\nThe manufacture of the car: " + manufacturer + "\nThe number of seats: " + numberOfSeats + "\n\n";
    }
}
