package one.digitalinnovation.interfaces;

public interface Vehicle {

    String register();

    default void turnOn() {
        System.out.println("Starting the vehicle");
    }

    // void turnOff()
}
