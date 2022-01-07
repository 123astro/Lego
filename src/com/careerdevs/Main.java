package com.careerdevs;

public class Main {

    public static void main(String[] args) {

        Man man = new Man(true, "red", "Keith");
        System.out.println(man.toString());

        Kart kart = new Kart(true, "Ford", "blue");
        System.out.println(kart.toString());

        Alien alien = new Alien(true, "Mars", "black");
        System.out.println(alien.toString());

        GeneralObject newObj = new GeneralObject(true, "green");
        System.out.println(newObj.toString());

    }
}
