import java.util.Scanner;

public class JogoDaVelha {

    private JogoDaVelha_Mapa jogoMapa;
    private JogoDaVelha_PC jogoPC;
    private JogoDaVelha_Jogador jogoJogador;
    int jogadas;

    public JogoDaVelha(JogoDaVelha_Jogador jogoJogador, JogoDaVelha_Mapa jogoMapa, JogoDaVelha_PC jogoPC) { 
        this.jogoMapa = jogoMapa; 
        this.jogoJogador = jogoJogador; 
        this.jogoPC = jogoPC; 
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        do {
            JogoDaVelha_Mapa jogoMapa = new JogoDaVelha_Mapa();
            JogoDaVelha_PC jogoPC = new JogoDaVelha_PC(jogoMapa);
            JogoDaVelha_Jogador jogoJogador = new JogoDaVelha_Jogador(jogoMapa);
            JogoDaVelha jogo = new JogoDaVelha(jogoJogador, jogoMapa, jogoPC);
            jogo.jogar(teclado);
            System.out.print("Deseja jogar novamente (s/n)? ");
        } while (teclado.next().equalsIgnoreCase("s"));

    }


    private void jogar(Scanner teclado) {
        jogoMapa.limpaMapa();
        jogadas = 0;

        boolean jogadorPrimeiro;

        int primeiro = jogoMapa.sortear(0, 2);

        if(primeiro == 1) { 
            jogadorPrimeiro = true; 
        } else {
            jogadorPrimeiro = false;
        }

        while (jogadas < 9) {
            jogoMapa.desenha(jogadas);
            System.out.printf("%n%n");
            if (jogadorPrimeiro) {
                jogoJogador.joga(teclado);
                if (jogoMapa.ganhou('X')) {
                    return;
                }
            } else {
                jogoPC.joga();
                if (jogoMapa.ganhou('O')) {
                    jogoMapa.desenha(jogadas);
                    return;
                }
            }
            jogadorPrimeiro = !jogadorPrimeiro;
            jogadas++;
        }
        System.out.println("... EMPATOU!");

    }
}