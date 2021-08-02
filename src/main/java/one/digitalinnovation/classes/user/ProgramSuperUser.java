package one.digitalinnovation.classes.user;

public class ProgramSuperUser {

    public static void main(String[] args) {
        final String s = "123456";
        final var superUser = new SuperUser("root","123456");

        superUser.getLogin();
        superUser.getPassword();

        String root = superUser.nome;
    }
}
