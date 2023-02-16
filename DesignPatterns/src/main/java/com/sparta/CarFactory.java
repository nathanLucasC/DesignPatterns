package com.sparta;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle getInstance() {
        return new Car();
    }
}
