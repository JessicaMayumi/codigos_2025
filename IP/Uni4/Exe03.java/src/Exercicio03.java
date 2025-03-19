import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
    
        if (a>b){
            System.out.printf("O valor %s é maior do que o valor %s", a,b);
        } else if (a<b){
            System.out.printf("O valor %s é maior do que o valor %s", b,a);
        } else{
            System.out.println("Os números são iguais!");
        }
    }

}
