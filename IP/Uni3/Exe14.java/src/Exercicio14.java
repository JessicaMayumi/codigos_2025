import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Distancia(km): ");
        float distancia = teclado.nextFloat();

        System.out.print("Tempo(horas): ");
        int horas = teclado.nextInt();

        float velocidadeMedia = distancia/horas;

        float combustivel = distancia/12f;

        System.out.printf("A velocidade média foi de %.2f km/h e a quantidade de combustível usado foi %.2f litros.", velocidadeMedia, combustivel);

    }
}
