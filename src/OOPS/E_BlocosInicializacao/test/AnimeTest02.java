package OOPS.E_BlocosInicializacao.test;

import OOPS.E_BlocosInicializacao.dominio.Anime;

public class AnimeTest02 {
    public static void main(String[] args) {
        Anime anime2 = new Anime("jp");
        for(int episodio : anime2.getEpisodios()){
            System.out.print(episodio + ",");
        }
    }
}
