import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Qt hrs trabalhadas nos mês: ");
        int horas = teclado.nextInt();
        System.out.print("Número de Dependentes: ");
        int dependentes = teclado.nextInt();
        
        int valorDependentes = 60*dependentes;
        float salario = 10f * horas;
        float salarioBruto = salario + valorDependentes; //salario bruto = valor/h(salario) + valor dos dependentes
        
        float valorINSS = salario*0.085f;
        float valorIR = salario*0.05f;
        float salarioLiquido = salarioBruto-(valorINSS+valorIR);

        System.out.printf("O funcionário %s possui um salário bruto de R$%.2f e um salário líquido de R$%.2f", nome, salarioBruto, salarioLiquido);
    }
}
