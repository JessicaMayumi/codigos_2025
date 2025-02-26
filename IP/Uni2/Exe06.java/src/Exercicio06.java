import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Exercicio 06");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o número do funcionário: ");
        int n = teclado.nextInt();
        System.out.print("Insira o número de horas trabalhadas: ");
        int horas = teclado.nextInt();
        System.out.print("Insira o valor recebido por hora: ");
        float valor = teclado.nextFloat();

        float salario = (horas * valor);

        System.out.printf("Número do funcionário: %s \tSalário: R$ %.2f", n, salario);


    }
}
