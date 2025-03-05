import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        System.out.print("Valor recebido: ");
        float valor = teclado.nextFloat();

        System.out.print("Cotacao: ");
        float cotacao = teclado.nextFloat();

        System.out.printf("O atendente deve devolver R$%.2f para o cliente.", cotacao*valor);

        
    }
}
