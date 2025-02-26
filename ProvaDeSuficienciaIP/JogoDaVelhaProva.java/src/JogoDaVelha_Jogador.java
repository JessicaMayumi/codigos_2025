import java.util.Scanner;

public class JogoDaVelha_Jogador extends JogoDaVelha_Mapa {
    private JogoDaVelha_Mapa mapa;
    char letra;

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa){
        letra = 'X';

    }

    public boolean joga(Scanner teclado){
        int linhaJogador = teclado.nextInt();
        int colunaJogador = teclado.nextInt();
        boolean posicaoValida = false;
        while (posicaoValida == false) {
            if(this.mapa.jogar(linhaJogador, colunaJogador, letra)){
                this.mapa.ganhou(letra);
                System.out.println(". . . PC GANHOU!");
                posicaoValida = true;
            }
            
        }
        return posicaoValida;
    }
}
