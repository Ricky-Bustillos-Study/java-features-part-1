package one.digitalinnovation.statics;

public class Program {

    public static void main(String[] args) {
        final Dog pitbull = new Dog();
        pitbull.zoology = "Biped";

        final Dog mutt = new Dog();

        System.out.println(pitbull.zoology);
        System.out.println(mutt.zoology);

        Dog.bark();
    }
}
