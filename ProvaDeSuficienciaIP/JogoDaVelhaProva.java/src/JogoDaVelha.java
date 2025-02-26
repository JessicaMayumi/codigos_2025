import java.util.Scanner;

public class JogoDaVelha {

    private JogoDaVelha_Mapa jogoMapa;
    private JogoDaVelha_PC jogoPC;
    private JogoDaVelha_Jogador jogoJogador;

    private void jogar(Scanner teclado){
        jogoMapa.limpaMapa();
        int numeroJogadas = 0;
        char[] jogadores = {'O', 'X'};
        int primeiroJogador = this.jogoMapa.sortear(0, jogadores.length);
        //precisa armazenar o numero de jogadas da partida e vai chamar o desenha, mas o desenha vai ser chamado
        // no proprio jogar ou no main?


        if(primeiroJogador == 0) {
            // define o pc como o aquele que vai jogar nas rodadas pares, logo o jogador vai jogar nas rodadas impares
            String pc = "par";
            String jogador = "impar";
            
        } else{
            // define o jogador como aquele que vai jogar nas rodadas pares, logo o pc vai jogar nas rodadas impares
            String pc = "par";
            String jogador = "impar";
        }
        
    }

    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in); // usado no jogar e no joga do jogador para pegar as posicoes

        boolean jogarNovamente = true;

        while(jogarNovamente){
            //jogar
            //desenha (numero de jogadas armazenadas no jogar)
            // quando alguem ganha, perguntar se o jogador que jogar novamente(usar o scanner teclado), caso sim: 
            // o jogarnovamente continua true,
            // caso nao: 
            // o jogar novamente returna false, parando o while
        }
    }
    
}