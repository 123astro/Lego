package com.careerdevs.polymorphism;

// overloading a method is a form of polymorphism;

public class FactoryWorker {
    public float total;

    public FactoryWorker() {}

    public void Count (int num){
        total = total + num;
        System.out.println(total);
    }
    public void Count (float num){
        total = total + num;
        System.out.println(total);
    }

}
