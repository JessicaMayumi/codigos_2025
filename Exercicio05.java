import java.util.Scanner;

public class Exercicio05 {

    //Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença 
    //do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    public static void main(String[] args) {
        System.out.println("Exercício 05");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = teclado.nextInt();

        System.out.print("Valor B: ");
        int b = teclado.nextInt();

        System.out.print("Valor C: ");
        int c = teclado.nextInt();

        System.out.print("Valor D: ");
        int d = teclado.nextInt();

        int dif = (a * b) - (c * d);

        System.out.printf("O resultado da conta (%s*%s - %s*%s) é %s!", a,b,c,d, dif);
        
    }
}
