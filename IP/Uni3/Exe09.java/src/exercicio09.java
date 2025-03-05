import java.util.Scanner;
public class exercicio09 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        System.out.print("Raio: ");
        float raio = teclado.nextFloat();
        System.out.print("Altura: ");
        float altura = teclado.nextFloat();

        float volume = 3.14159f * (raio * raio) * altura;

        System.out.printf("O volume da lata de óleo é: %.2f", volume);
    }
}
