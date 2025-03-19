import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();

        if (valor %2==0){
            System.out.println("Número é par");
        } else {

            System.out.println("Número é ímpar");
        }
    }
}
