// package
package one.digitalinnovation.classes.user;

// class
public class SuperUser {

    // class attributes
    private String login;
    private String password;
    String nome;

    // class constructor
    public SuperUser(final String login, final String password) {
        this.login = login;
        this.password = password;
    }

    // class methods
    public String getLogin() {
        return login;
    }

    protected String getPassword() {
        return password;
    }

}
