import java.util.Scanner;

public class JogoDaVelha {

    private JogoDaVelha_Mapa jogoMapa;
    private JogoDaVelha_PC jogoPC;
    private JogoDaVelha_Jogador jogoJogador;
    
    public JogoDaVelha(JogoDaVelha_Jogador jogoJogador, JogoDaVelha_Mapa jogoMapa, JogoDaVelha_PC jogoPC) { 
        this.jogoMapa = jogoMapa; 
        this.jogoJogador = jogoJogador; 
        this.jogoPC = jogoPC; 
    }

    public static void main(String[] args) {
        // o método main declarar a única ocorrência do objeto teclado da classe 
        // Scanner para permitir ler dados do console   usando - o teclado;  (feito)

        //o método main instância os objetos das classes: JogoDaVelha_Mapa, 
        // JogoDaVelha_PC e JogoDaVelha_Jogador, para iniciar   os - seus atributos; (feito)

        // o método main controla se “Deseja jogar novamente”;  (feito)

        Scanner teclado = new Scanner(System.in);
        do {
            JogoDaVelha_Mapa jogoMapa = new JogoDaVelha_Mapa();
            JogoDaVelha_PC jogoPC = new JogoDaVelha_PC(jogoMapa);
            JogoDaVelha_Jogador jogoJogador = new JogoDaVelha_Jogador(jogoMapa);
            JogoDaVelha jogo = new JogoDaVelha(jogoJogador, jogoMapa, jogoPC);
            jogo.jogar(teclado);
            System.out.println("________________________");
            System.out.print("Deseja jogar novamente (s/n)? ");
        } while (
            teclado.next().equalsIgnoreCase("s")
            );

    }


    private void jogar(Scanner teclado) {
        // o método jogar “limpa" o mapa a cada nova partida;  (feito)

        // o método jogar sorteia quem inicia a partida (jogador ou PC); (feito)

        // o método jogar tem a variável que conta quantas jogadas já foram executadas; (feito)

        // o método jogar chama o método de desenhar o mapa;   (feito)

        // o método jogar tem o laço que controla as jogadas, alternando a vez 
        // entre jogador e PC. (feito)

        jogoMapa.limpaMapa();
        int jogadas = 0;

        boolean jogadorPrimeiro;

        int primeiro = jogoMapa.sortear(0, 2);

        if(primeiro == 1) { 
            jogadorPrimeiro = true; 
        } else {
            jogadorPrimeiro = false;
        }

        // a cada jogada testar quem venceu a partida (jogador ou PC);  

        // considerar o caso de empate no final da partida;  
        while (jogadas < 9) {
            jogoMapa.desenha(jogadas);
            System.out.println("----------------------------");
            if (jogadorPrimeiro) {
                jogoJogador.joga(teclado);
                if (jogoMapa.ganhou('X')) {
                    jogoMapa.desenha(jogadas);
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
        jogoMapa.desenha(jogadas);
        System.out.println("... EMPATOU!");

    }
}