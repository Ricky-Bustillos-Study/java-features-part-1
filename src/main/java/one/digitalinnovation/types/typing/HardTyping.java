package one.digitalinnovation.types.typing;

public class HardTyping {

    public static void main(String[] args) {

        String text = "my text";
        // text = 1000; // NOK

        Integer number = Integer.valueOf("1024");
        number = 512; // OK

    }
}
