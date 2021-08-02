package one.digitalinnovation.types.typing;

public class InferredType {

    public static void main(String[] args) {

        // a partir do Java 10 é possível criar váriaveis e atribuir tipos sem precisar explicitar sua tipagem
        var number = 123456;
        var text = "The number is : ";

        System.out.println(text + number);

    }
}
