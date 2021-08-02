package one.digitalinnovation.classes.customer;

public class CustomerProgram {

    public static void main(String[] args) {
        final var customer = new Customer(18);

        customer.getAge();
        customer.getWeight();

        // System.out.println(customer.report()); // ERROR
    }
}
