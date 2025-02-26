public class JogoDaVelha_PC {
    private JogoDaVelha_Mapa mapa;
    private char letra = 'O';
    boolean valido;
    int linha;
    int coluna;

    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) { 
        this.mapa = mapa; 
    }

    public boolean joga(){
        do {
            linha = mapa.sortear(0, 3);
            coluna = mapa.sortear(0, 3);
            valido = mapa.jogar(linha, coluna, letra);
        } while (!valido);
        if(mapa.ganhou(letra)){ 
            System.out.println(". . . PC GANHOU!"); 
        }
        return true;
    }

}

