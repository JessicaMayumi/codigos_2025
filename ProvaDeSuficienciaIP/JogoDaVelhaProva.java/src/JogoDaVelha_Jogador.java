import java.util.Scanner;

public class JogoDaVelha_Jogador {
    // a jogada do jogador deve ser representada pelo caráter “X” (sua letra); (feito)
    private JogoDaVelha_Mapa mapa;
    private char letra = 'X';

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) { 
        this.mapa = mapa; 
    }

    public boolean joga(Scanner teclado){
        // usar o método joga para ler linha e coluna do teclado;  (feito)
        // a cada jogada testar se o jogador venceu, e neste caso imprimir " ... Jogador GANHOU!”; (feito)
        // verificar se os valores de linha e coluna são válidos (dentro dos limites do mapa). (feito na classe do mapa)

        int linha;
        int coluna;
        boolean valido;

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
