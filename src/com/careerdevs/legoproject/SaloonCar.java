package com.careerdevs.legoproject;

public class SaloonCar extends Car{  //inheritance
    public int numberOfSeats;

    public SaloonCar(int numberOfSeats) { //polymorphism with overloaded methods.
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(String manufacturer, int numberOfSeats){
        super(manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(String color, String manufacturer, int numberOfSeats) {
        super(color, manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public String toString(){
        if (color != null && manufacturer != null && numberOfSeats != 0)
            return "\nColor of car: " + color + "\nThe manufacturer of the car: " + manufacturer + "\nThe number of " +
                    "seats:" +
                " " + numberOfSeats;

        if (color == null && manufacturer == null){
            return "\nThe number of seats:"  + numberOfSeats;
        }

        if (manufacturer != null && color == null){
            return "\nThe manufacturer of the car: " + manufacturer + "\nThe number of seats:" +
                    " " + numberOfSeats;
        }
        return "";
    }
}
