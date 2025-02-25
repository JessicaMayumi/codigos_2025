import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Multiplicação de dois inteiros");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n1 = teclado.nextInt();
        System.out.print("Insira outro número inteiro: ");
        int n2 = teclado.nextInt();
        int mult = n1 * n2;

        System.out.printf("A multiplicação %sx%s é %s!", n1, n2, mult);
    }
}
