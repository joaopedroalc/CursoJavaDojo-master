package OOPS.G_Associacao.test;

import OOPS.G_Associacao.dominio.Jogador;
import OOPS.G_Associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("pepeto");
        Jogador jogador02 = new Jogador("marcos");
        Time time = new Time("Barcelona");

        Jogador[] jogadores = {jogador01, jogador02};

        jogador01.setTime(time);
        jogador02.setTime(time);

        time.setJogadores(jogadores);
        System.out.println("DENTRO DA CLASSE JOGADOR :");
        jogador02.imprime();
        System.out.println("DENTRO DA CLASSE TIME :");
        time.imprime();
    }
}
