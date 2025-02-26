import java.util.Scanner;

// faltou o valor da venda

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("Exercicio 07");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o nome do vendedor: ");
        float salario = teclado.nextFloat();
        System.out.print("Número de vendas no mês: ");
        int vendas = teclado.nextInt();

        float total = salario + (vendas * (salario))
    }
}
