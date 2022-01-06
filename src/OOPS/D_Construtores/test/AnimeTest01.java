package OOPS.D_Construtores.test;

import OOPS.D_Construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("jp","tv",200, "Ação", "netflix");
//        anime.init("igo","pc", 120);
//        anime.init("jp","tv",200, "Ação");
        anime.imprime();
    }
}
