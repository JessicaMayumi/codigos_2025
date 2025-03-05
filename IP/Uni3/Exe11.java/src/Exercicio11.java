import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Temperatura em C°: ");
        float temp = teclado.nextFloat();

        float f = (temp*9/5) + 32f;

        System.out.println(f);
    }
}
