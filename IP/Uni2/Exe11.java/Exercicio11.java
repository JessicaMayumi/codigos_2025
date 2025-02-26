import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        System.out.println("Exercicio 11");

        Scanner teclado = new Scanner(System.in);

        System.out.print("A: ");
        float a = teclado.nextFloat();
        System.out.print("B: ");
        float b = teclado.nextFloat();
        System.out.print("C: ");
        float c = teclado.nextFloat();

        // a) a área do triângulo retângulo que tem A por base e C por altura.
        System.out.printf("Area do triangulo retangulo: %s", ((C*A)/2));

        //b) a área do círculo de raio C. (pi = 3.14159).
        System.out.printf("Área do círculo: %s", (C*C*3.14159));

        // area do trapezio A=(a+b)h/2
        //c) a área do trapézio que tem A e B por bases e C por altura.
        System.out.printf("Área do Trapézio: %s", ((a+b)*c/2));

        //a área do quadrado que tem lado B.
        System.out.printf("Area do quadrado B: %s", (b*b));

        //e) a área do retângulo que tem lados A e B.
        System.out.printf("Area do Retangulo A B: %s", (a*b));
    }
}
