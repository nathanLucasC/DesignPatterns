package com.sparta.decorator;

public class PepperoniDecorator extends PizzaToppingDecorator{

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String pepperoniTopping = "Adding pepperoni ";
        return super.prepare() + pepperoniTopping;
    }

    @Override
    public double getPrice() {
        double pepperoniPrice = 4.0;
        return super.getPrice() + pepperoniPrice;
    }
}
