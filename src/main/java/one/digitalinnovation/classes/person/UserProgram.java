package one.digitalinnovation.classes.person;

import one.digitalinnovation.classes.user.SuperUser;

public class UserProgram {

    public static void main(String[] args) {
        final var batman = new SuperUser("batman","123456");

        batman.getLogin();

        // batman.getPassword(); // ERRO

        // String customerName = batman.name; // ERRO
    }

}
