import java.util.Scanner;

public class JogoDaVelha_Jogador {
    private JogoDaVelha_Mapa mapa;
    private char letra = 'X';
    int linha;
    int coluna;
    boolean valido;

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) { 
        this.mapa = mapa; 
    }

    public boolean joga(Scanner teclado){

        do {
            System.out.println("Jogador . .");

            System.out.println(" Linha: ");
            linha = teclado.nextInt();
            System.out.println(" Coluna: ");
            coluna = teclado.nextInt();
            valido = mapa.jogar(linha, coluna, letra);
        } while (!valido);
        if(mapa.ganhou(letra)){ 
            System.out.println(". . . Jogador GANHOU!"); 
        }
        return true;
    }
}
