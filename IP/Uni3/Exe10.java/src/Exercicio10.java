import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cateto 1:");
        float c1 = teclado.nextFloat();
        System.out.print("Cateto 2:");
        float c2 = teclado.nextFloat();

        float hipotenusa = (float )Math.sqrt((c1*c1)+(c2 * c2));

        System.out.printf("A hipotenusa é: %.2f", hipotenusa);
    }
}
