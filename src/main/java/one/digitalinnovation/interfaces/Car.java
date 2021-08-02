package one.digitalinnovation.interfaces;

public interface Car extends Automobile {

    String brand();

    Double value();

    default void turnOn() {
        System.out.println("Starting the car.");
    }

    default String renavanCode() {
        return "654FGHRTY";
    }
}