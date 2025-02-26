public class JogoDaVelha_PC extends JogoDaVelha_Mapa {
    private JogoDaVelha_Mapa mapa;
    private char letra;

    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa){
        letra = 'O';
    }

    public boolean joga(){
        int linhaPC = sortear(0,2);
        int colunaPC = sortear(0, 2)
    }
}
