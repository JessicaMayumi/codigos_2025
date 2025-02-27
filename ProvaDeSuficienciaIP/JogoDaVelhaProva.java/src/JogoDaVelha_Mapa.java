import java.util.Random;

public class JogoDaVelha_Mapa {

        // o mapa é definido pelo tipo primitivo char;  (feito)

        private char[][] mapa = new char[3][3];

        public void limpaMapa() {
            // usar o caráter ' ' (espaço em branco) para limpar o mapa;  (feito) 
            for (int i = 0; i<3; i++){
                for (int c = 0; c<3; c++){
                    mapa[i][c] = ' ';
                }
            }
        }

        public int sortear(int inicio, int fim){
            // o método sortear pode ser buscado na internet; (feito)
            Random random = new Random();
            return random.nextInt(inicio, fim);
        }

        public void desenha(int jogada){
                System.out.println("------------- . . Jogada: "+jogada);
                for(int l=0; l<3; l++){
                    System.out.println(" | " + mapa[l][0] + " | " + mapa[l][1] + " | " + mapa[l][2] + " | ");
                    if(l<2){ System.out.println("-------------"); }
            }
        }

        public boolean jogar(int l, int c, char jogador){
            //testar no método jogar se a linha e coluna recebida representa uma 
            // célula livre no mapa, e em caso positivo marcar nesta célula quem 
            // jogou (usar a letra).   (feito)

            if(l > 2 || c > 2){
                System.out.println("Sua jogada esta fora dos limites do tabuleiro, por favor utilize 0, 1 ou 2 para as linhas e colunas");
                return false;
            }
            if(mapa[l][c] == ' '){
                mapa[l][c] = jogador;
                return true;
            }
            if(jogador == 'X') { System.out.println("Jogada Invalida, Por favor tente novamente!"); }
            return false;
        }

        public boolean ganhou(char jogador){
            for (int l = 0; l < 3; l++) {
                int c = 0;
                if (mapa[l][c] == jogador && mapa[l][c + 1] == jogador && mapa[l][c + 2] == jogador) {
                    return true;
                }
            }
            for (int c = 0; c < 3; c++) {
                int l = 0;
                if (mapa[l][c] == jogador && mapa[l + 1][c] == jogador && mapa[l + 2][c] == jogador) {
                    return true;
                }
            }
            if ((mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador) ||
                    (mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador)) {
                return true;
            }
            return false;
        }
}




