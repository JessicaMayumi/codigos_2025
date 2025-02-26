import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println("Exercicio 12");
        Scanner teclado = new Scanner(System.in);

        System.out.print("X1:");
        float x1 = teclado.nextFloat();
        System.out.print("Y1:");
        float y1 = teclado.nextFloat();
        System.out.print("X2:");
        float x2 = teclado.nextFloat();
        System.out.print("Y2: ");
        float y2 = teclado.nextFloat();

        float distancia = (float) Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));


        System.out.printf("Distancia: %.4f", distancia);
    }
}
