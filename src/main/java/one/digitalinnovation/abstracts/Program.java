package one.digitalinnovation.abstracts;

public class Program {

    public static void main(String[] args) {
        // final GeometricForm geometricForm = new GeometricForm();

        final GeometricForm square = new Square("square", 100.0);

        System.out.println(square);

        System.out.println(square.draw(12,24));
        System.out.println(square.name());
        System.out.println(square.area());
    }
}
