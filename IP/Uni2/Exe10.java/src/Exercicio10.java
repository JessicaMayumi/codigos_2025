import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Exercicio 10");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a duração em segundos: ");
        int segundos = teclado.nextInt();

        int hora = segundos/3600;
        segundos = segundos % 3600;
        int minutos = segundos/60;
        segundos = segundos % 60;

        System.out.printf("%s:%s:%s", hora, minutos, segundos);


    }
}
