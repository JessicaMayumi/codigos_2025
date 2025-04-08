import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do litro da gasolina: ");
        float valorGasolina = teclado.nextFloat();

        System.out.print("Insira o valor à pagar: ");
        float valorPagar = teclado.nextFloat();

        float litroTanque = valorPagar/valorGasolina;

        System.out.printf("O motorista conseguiu colocar: %.2f", litroTanque);

        teclado.close();
    }
}
