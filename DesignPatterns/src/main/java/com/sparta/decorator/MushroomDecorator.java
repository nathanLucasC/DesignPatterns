package com.sparta.decorator;

public class MushroomDecorator extends PizzaToppingDecorator{

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        return super.prepare() + "Adding mushrooms ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }
}
