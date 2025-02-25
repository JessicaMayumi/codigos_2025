import java.util.Scanner;

// Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A 
//tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Exercício 04");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float n2 = teclado.nextFloat();

        double media = ((n1 * 3.5) + (n2 * 7.5)) / 11;

        System.out.printf("A média desse aluno é %s!", media);

    }
}
