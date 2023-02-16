package com.sparta;

public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Starts the engine and put in gear");
    }
}
