import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor do calcado: ");
        float valorTotal = teclado.nextFloat();

        float valorDesconto = valorTotal* 0.12f;

        float valorPagar = valorTotal - valorDesconto;

        System.out.printf("O valor do desconto é de R$%.2f%n", valorDesconto);
        System.out.printf("O preço do par de sapatos com desconto é R$%.2f", valorPagar);
    }
}
