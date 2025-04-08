import java.util.Scanner;

public class Exercício26 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        String r = s.nextLine();

        switch(r){
            case "T":
                int base = s.nextInt();
                int altura = s.nextInt();
                System.out.println((base*altura)/2);
                break;
            case "Q":
                int l = s.nextInt();
                System.out.println(l*l);
                break;
            case "R":
                int base2 = s.nextInt();
                int altura2 = s.nextInt();
                System.out.println(base2*altura2);
                break;
            case "C":
                int raio = s.nextInt();
                System.out.println((raio*raio)*3.1415f);
                break;
            default:
                System.out.println("Opçao invalida");
    }
    }

       
}
