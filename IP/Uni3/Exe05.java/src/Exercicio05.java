import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o número de frangos: ");
        int frangos = teclado.nextInt();

        System.out.printf("O gasto total para marcar %s é R$%.2f", frangos, frangos*11f); 
        //11 pois é 3.5 * 2 (esquerdo) + 4 (direita)
    }
}
