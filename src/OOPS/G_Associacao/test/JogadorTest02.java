package OOPS.G_Associacao.test;

import OOPS.G_Associacao.dominio.Jogador;
import OOPS.G_Associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("jp");
        Jogador jogador02 = new Jogador("isa");
        Jogador[] jogadores = new Jogador[]{jogador01,jogador02};

        Time time = new Time("Mengo", jogadores);

        time.imprime();

//        jogador01.setTime(time);
//        jogador01.imprime();
    }
}
