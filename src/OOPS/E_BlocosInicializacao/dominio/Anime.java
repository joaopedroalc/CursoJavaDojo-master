package OOPS.E_BlocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for(int i=0; i<episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio : this.episodios){
            System.out.print(episodio + ",");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
