package one.digitalinnovation.interfaces;

public class Fiesta implements Car, Vehicle {

    @Override
    public String brand() {
        return "Ford";
    }

    @Override
    public Double value() {
        return null;
    }

    @Override
    public String register() {
        return "ABC123456ASD";
    }

    @Override
    public void turnOn() {
        Car.super.turnOn();
        Vehicle.super.turnOn();
    }
}

