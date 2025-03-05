import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o peso total do Prato: ");
        float totalPrato = teclado.nextFloat();

        float valorPagar = ( totalPrato - 0.750f ) * 25;

        System.out.printf("O valor do prato do cliente é R$%.2f", valorPagar);

    }
}
