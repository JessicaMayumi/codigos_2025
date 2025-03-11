import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Altura: ");
        float altura = teclado.nextFloat();

        System.out.print("Comprimento: ");
        float comprimento = teclado.nextFloat();

        float valorMQ = 9f * 12.50f;
        float totalMQ = comprimento * altura;

        float valorPagar = valorMQ * totalMQ;

        System.out.printf("O valor final é $%.2f", valorPagar);
    }
}
