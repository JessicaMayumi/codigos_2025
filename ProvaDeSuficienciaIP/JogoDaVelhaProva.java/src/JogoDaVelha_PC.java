public class JogoDaVelha_PC {
    // a jogada do PC deve ser representada pelo caráter “O” (sua letra); (feito)
    private JogoDaVelha_Mapa mapa;
    private char letra = 'O';

    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) { 
        this.mapa = mapa; 
    }

    public boolean joga(){
        // usar o método sortear para definir a próxima jogada do PC;  (feito)
        // a cada jogada testar se o PC venceu, e neste caso imprimir " ... PC GANHOU!”. (feito)

        boolean valido;
        int linha;
        int coluna;

        do {
            linha = mapa.sortear(0, 3);
            coluna = mapa.sortear(0, 3);
            valido = mapa.jogar(linha, coluna, letra);
        } while (!valido);

        System.out.printf("PC [%s , %s]%n", linha, coluna);

        if(mapa.ganhou(letra)){ 
            
            System.out.println(". . . PC GANHOU!"); 
        }
        return true;
    }

}

