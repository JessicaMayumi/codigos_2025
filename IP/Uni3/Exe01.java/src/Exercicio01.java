import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Exercicio 01");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        float x = teclado.nextFloat();
        System.out.print("Insira outro número: ");
        float y = teclado.nextFloat();

            
        System.out.printf("Resultado: %s", x*y);
    }
}
