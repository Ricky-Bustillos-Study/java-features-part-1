package one.digitalinnovation.interfaces;

public class Program {

    public static void main(String[] args) {

        final Car gol = new Gol();
        System.out.println("Gol brand: "+gol.brand());
        gol.turnOn();

        final Vehicle tractor = new Tractor();
        System.out.println("Tractor register: "+tractor.register());
        tractor.turnOn();

        final Fiesta fiesta = new Fiesta();
        System.out.println("Fiesta brand: "+fiesta.brand());
        System.out.println("Fiesta register: "+fiesta.register());
        fiesta.turnOn();
    }
}
