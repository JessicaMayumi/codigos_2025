import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        int horasMes = s.nextInt();
        float horasValor = s.nextFloat();

        float salarioTotal = horasMes * horasValor;

        if (horasMes > 160) {
            float salarioExtra = (horasMes - 160) * (horasValor/2);
            salarioTotal = salarioTotal + salarioExtra;
        
        System.out.printf("O salário total é R$%.2f", salarioTotal);
    }
    
}

}
