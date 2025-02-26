import java.util.Scanner;

public class Exercicio01 {

    // Anásile do problema: o nome nao é utilizado
    // Entrada: n1, n2, n3, nome
    // Processo: media = (n1 + n2 + n3) /3 
    // Saída: media


    //Testes: 
    //n1    | 9 | 9 | 8
    //n2    | 9 | 4 | 9
    //n3    | 9 | 5 | 7
    //media | 9 | 6 | 8

    public static void main(String[] args) {
        //System.out.print("Olá");

        //System.out.println("Oi");

        //System.out.println("Oiê");




        System.out.println("Cálculo de Média de Notas");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Insira a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float n2 = teclado.nextFloat();
        System.out.print("Insira a terceira nota: ");
        float n3 = teclado.nextFloat();
        
        float media = (n1 + n2 + n3) / 3;

        //System.out.println("Nome: " + nome);
        //System.out.println("Média do aluno: " + media);
        System.out.printf("O aluno(a) %s tirou média %s!", nome, media);
    }

}
