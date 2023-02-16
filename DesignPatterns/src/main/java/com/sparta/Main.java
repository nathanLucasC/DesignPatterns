package com.sparta;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Please enter a vehicle");
        Scanner scanner = new Scanner(System.in);
        String desiredVehicleType = scanner.nextLine();
        Vehicle v = getVehicle(desiredVehicleType);
        v.drive();


    }

    public static Vehicle getVehicle(String vehicleType){
        VehicleFactory vFactory;
        if(vehicleType.equals("Car")){
            vFactory = new CarFactory();
        }
        else if(vehicleType.equals("Helicopter")){
            vFactory = new HelicopterFactory();
        }
        else {
            System.out.println("Please enter a valid vehicle");
            return null;
        }
        return vFactory.getInstance();
    }
}