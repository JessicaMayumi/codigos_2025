import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println("Exercicio 09");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor da Cotacao do Dolar: ");
        float cotacaoDolar = teclado.nextFloat();
        System.out.print("Valor em reais: ");
        float valor = teclado.nextFloat();

        float valorRecebido = cotacaoDolar*valor;

        System.out.printf("Valor a receber: %s", valorRecebido );

    }
}
