package com.careerdevs;

import com.careerdevs.inheritance.Alien;
import com.careerdevs.inheritance.GeneralObject;
import com.careerdevs.inheritance.Kart;
import com.careerdevs.inheritance.Man;

public class Main {

    public static void main(String[] args) {

        Man man = new Man(true, "red", "Keith");
        System.out.println(man);

        Kart kart = new Kart(true, "Ford", "blue");
        System.out.println(kart);

        Alien alien = new Alien(true, "Mars", "black");
        System.out.println(alien);

        GeneralObject newObj = new GeneralObject(true, "green");
        System.out.println(newObj);

    }
}
