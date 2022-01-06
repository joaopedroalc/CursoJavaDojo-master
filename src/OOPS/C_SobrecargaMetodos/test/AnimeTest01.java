package OOPS.C_SobrecargaMetodos.test;

import OOPS.C_SobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("igo","pc", 120);
        anime.init("jp","tv",200, "Ação");
        anime.imprime();
    }
}
