public class JogoDaVelha_PC extends JogoDaVelha_Mapa {
    private JogoDaVelha_Mapa mapa;
    private char letra;

    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa){
        letra = 'O';
    }

    public boolean joga(){
        boolean posicaoValida = false;
        while(posicaoValida == false){
            int linhaPC = this.mapa.sortear(0,2);
            int colunaPC = this.mapa.sortear(0, 2);
            if(this.mapa.jogar(linhaPC, colunaPC, letra)){
                this.mapa.ganhou(letra);
                System.out.println(". . . PC GANHOU!");
                posicaoValida = true;
            }
                 
        }
        return posicaoValida;
    }
}
