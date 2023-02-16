package com.sparta.decorator;

public abstract class PizzaToppingDecorator implements Pizza{
    protected Pizza pizza;
    public PizzaToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String prepare() {
        return pizza.prepare();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
