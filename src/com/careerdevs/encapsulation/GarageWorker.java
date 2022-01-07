package com.careerdevs.encapsulation;

// example: process where the main class expects a certain result when instantiating. Main does not care what is
// going on in the code for GarageWorker class.  Data hiding == encapsulation.

public class GarageWorker {
    public GarageWorker() {
    }

    public int addNumbers( int num1, int num2){
       int result = num1 + num2;
       result = result + 100; // encapsulation - creating the proper output and don't care ab out the internal workings.
       result = result - 100; // bs code
        System.out.println(result);
       return result;
    }

}
