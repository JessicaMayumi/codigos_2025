import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        System.out.println("Exercicio 14");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor: ");
        int total = teclado.nextInt();
        int valor = total;

        int n100 = total/100;
        total = total%100;

        int n50 = total/50;
        total=total%50;

        int n20 = total/20;
        total = total%20;

        int n10 = total/10;
        total = total%10;

        int n5 = total/5;
        total = total%5;

        int n2 = total/2;
        total = total%2;

        int n1 = total%2;

        System.out.printf("Total: %s \n100: %s \n50: %s \n20: %s \n10: %s \n5: %s \n2: %s \n1: %s", valor, n100, n50, n20, n10, n5, n2, n1);

    }
}
