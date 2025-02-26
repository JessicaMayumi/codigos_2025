import java.util.Random;

public class JogoDaVelha_Mapa {
    private char[][] mapa;

    public JogoDaVelha_Mapa(){
       mapa = new char[3][3];
    }

    public int sortear(int inicio, int fim){
        Random sorteio = new Random();
        return sorteio.nextInt(fim - inicio + 1) + inicio; // entender melhor como funciona
    }

    public void limpaMapa(){
        // usar o caráter ' ' (espaço em branco) para limpar o mapa; 
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++){
                mapa[l][c] = ' ';
            }
        }
    }

    public void desenha(int jogada){
        System.out.println("------------- .. jogada: " + jogada);

        for(int l=0; l<3; l++){
            System.out.println(" | " + this.mapa[l][0] + " | " + this.mapa[l][1] + " | " + this.mapa[l][2] + " | ");
            if(l<2){
                System.out.println("----------------------------");
            }
        }

    }

    public boolean jogar(int l, int c, char jogador){
        // testar no método jogar se a linha e coluna recebida representa uma 
        // célula livre no mapa, e em caso positivo marcar nesta célula quem 
        // jogou (usar a letra). 
        
            if (this.mapa[l][c] == ' '){
                this.mapa[l][c] = jogador;
                return true;
            } else {
                if (jogador == 'X'){
                    System.out.println("Posição inválida. Tente outra posição! ");
                }
                return false;
            }
        }

       

    

    public boolean ganhou(char jogador){
        // a cada jogada testar quem venceu a partida (jogador ou PC);  
        // considerar o caso de empate no final da partida; 
        

        // Verificando as linhas
        for(int l=0; l<3; l++){
            int c = 0;
            if(this.mapa[l][c] == jogador && this.mapa[l][c+1] == jogador && this.mapa[l][c+2] == jogador){
                return true;
            }
        }

        // Verificando as colunas
        for(int c=0; c<3; c++){
            int l = 0;
            if(this.mapa[l][c] == jogador && this.mapa[l+1][c] == jogador && this.mapa[l+2][c] == jogador){
                return true;
            }
        }

        // Verificando Diagonais
        if ((this.mapa[0][0] == jogador && this.mapa[1][1] == jogador && this.mapa[2][2] == jogador) || 
        (this.mapa[0][2] == jogador && this.mapa[1][1] == jogador && this.mapa[2][0] == jogador)) {
            return true;
        }

        return false;

    }
}

