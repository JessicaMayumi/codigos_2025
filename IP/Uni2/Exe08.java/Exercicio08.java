import java.util.Scanner;
// codigos nao estao sendo utilizados
public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("Exercicio 08");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cód peca 1: ");
        String cod1 = teclado.nextLine();
        System.out.print("Número de pecas 1: ");
        int n1 = teclado.nextInt();
        System.out.print("Valor por peca 1: ");
        float valor1 = teclado.nextFloat();
        
        System.out.print("Cód peca 2: ");
        String cod2 = teclado.nextLine();
        System.out.print("Número de pecas 2: ");
        int n2 = teclado.nextInt();
        System.out.print("Valor por peca 2: ");
        float valor2 = teclado.nextFloat();

        float total1 = n1 * valor1;
        float total2 = n2 * valor2;

        float totalPagar = total1 + total2;

        System.out.printf("Valor total a ser pago: R$ %.2f", totalPagar);
    }   
}
