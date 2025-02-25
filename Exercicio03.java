import java.util.Scanner;

public class Exercicio03 {

    // Análise: 
    // Entrada: raio
    // Processo: raio*raio*3.14159
    // Saída: área da circunferencia
    // Fluxograma
    // Teste: raio = 10
    // 10 * 10 * 3.14159 = 314,159

    public static void main(String[] args) {
        System.out.println("Exercício 03");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o raio do cículo: ");
        double raio = teclado.nextDouble();
        double area = (raio*raio)* 3.14159;

        System.out.printf("A área da circunferência de um círculo com raio de %s é %s!", raio, area);
    }
}
