package OOPS.G_Associacao.test;

import OOPS.G_Associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("jonas");
        Jogador j2 = new Jogador("gabico");
        Jogador j3 = new Jogador("paçoca");

        Jogador[] arrayJogadores = {j1,j2,j3};
        System.out.println(arrayJogadores);

        for(Jogador jogador: arrayJogadores){
            jogador.imprime();
        }

    }
}
