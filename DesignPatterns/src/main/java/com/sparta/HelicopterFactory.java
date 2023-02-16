package com.sparta;

public class HelicopterFactory extends VehicleFactory{
    @Override
    public Vehicle getInstance() {
        return new Helicopter();
    }
}
