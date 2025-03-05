import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Nota 2: ");
        float n2 = teclado.nextFloat();
        System.out.print("Nota 3: ");
        float n3 = teclado.nextFloat();

        float media = (n1 * 0.5f) + (n2 * 0.3f) + (n3 * 0.2f);

        System.out.println(media);
    }
}
