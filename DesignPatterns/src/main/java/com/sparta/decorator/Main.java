package com.sparta.decorator;

public class Main {

    public static void main(String[] args){
        Pizza p1 = new MushroomDecorator(new PepperoniDecorator(new PlainPizza()));
        System.out.println(p1.prepare());
        System.out.println(p1.getPrice());


    }
}
