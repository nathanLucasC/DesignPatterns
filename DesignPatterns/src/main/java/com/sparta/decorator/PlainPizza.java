package com.sparta.decorator;

public class PlainPizza implements Pizza{

    public String prepare(){
        return "Preparing signature thin dough ";
    }
    public double getPrice(){
        return 4.0;
    }
}
