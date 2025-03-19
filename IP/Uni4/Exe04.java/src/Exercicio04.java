import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float valor = s.nextFloat();

        if(valor%1==0){
            System.out.println("Casas decimais não foram digitadas.");
        } else {
            System.out.println("Casas decimais foram digitadas.");
        }
    }
}
