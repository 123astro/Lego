package com.careerdevs;

import com.careerdevs.encapsulation.GarageWorker;
import com.careerdevs.inheritance.*;
import com.careerdevs.legoproject.SaloonCar;
import com.careerdevs.polymorphism.FactoryWorker;

public class Main {

    public static void main(String[] args) {

        Women women = new Women(true,"Silver", "Jen");
        System.out.println(women);

        Man man = new Man(true, "Green", "Keith");
        System.out.println(man);

        Kart kart = new Kart(true, "Ford", "blue");
        System.out.println(kart);

        Alien alien = new Alien(true, "Mars", "black");
        System.out.println(alien);

        GeneralObject newObj = new GeneralObject(true, "green");
        System.out.println(newObj);

        FactoryWorker worker = new FactoryWorker();
        worker.Count(10);
        worker.Count(10.5F);

        GarageWorker worker1 = new GarageWorker();
        worker1.addNumbers(2,3);

        SaloonCar car = new SaloonCar(2);
        System.out.println(car);

        SaloonCar car1 = new SaloonCar("Nissan", 3);
        System.out.println(car1);

        SaloonCar car2 = new SaloonCar("Purple", "Ford", 4);
        System.out.println(car2);

    }
}
