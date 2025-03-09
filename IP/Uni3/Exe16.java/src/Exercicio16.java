import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);


        System.out.print("Valor da Compra (sem centavos): ");
        int valorCompra = teclado.nextInt();
        System.out.print("Valor dado pelo Cliente (sem centavos): ");
        int valorCliente = teclado.nextInt();

        int valor = valorCliente - valorCompra;

        int n100 = valor/100;
        valor = valor%100;
        int n10 = valor/10;
        int n1 = valor%10;

        int qtd = n100 + n10 + n1;

        System.out.printf("O número mínimo de notas de troco é: %s", qtd);
    }
}
