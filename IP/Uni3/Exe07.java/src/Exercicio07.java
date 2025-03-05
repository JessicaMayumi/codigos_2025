import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qtd de 350ml: ");
        int l350 = teclado.nextInt();
        System.out.print("Qtd de 600ml: ");
        int l600 = teclado.nextInt();
        System.out.print("Qtd de 2L: ");
        int g2L = teclado.nextInt();

        float totalLitros = (0.350f * l350) + (0.600f * l600) + (2 * g2L);

        System.out.printf("O cliente comprou ao total %.2f litros", totalLitros);
    }
}
