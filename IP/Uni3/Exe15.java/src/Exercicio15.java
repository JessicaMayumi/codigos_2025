import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
                do{
                    System.out.print("Escreva um número válido de até 3 dígitos: ");
                    numero = teclado.nextInt();
                } while (numero >=1000);
        
        int centenas = numero/100;
        numero = numero%100;
        int dezenas = numero/10;
        int unidades = numero%10;

        System.out.printf("%s centena(s) %s dezena(s) %s unidade(s)", centenas, dezenas, unidades);
    }
}
