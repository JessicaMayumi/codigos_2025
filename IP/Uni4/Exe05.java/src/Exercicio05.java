import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("A cor é azul? (s ou n): ");

        char resposta = s.next().charAt(0);

        if(resposta=='s'){
            System.out.println("Sim");
        } else{
            System.out.println("Não");
        }
    }
}
