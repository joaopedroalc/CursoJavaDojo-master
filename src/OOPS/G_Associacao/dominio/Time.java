package OOPS.G_Associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public void imprime(){
        System.out.println(this.nome);
        if (jogadores != null){
            for (Jogador jogador : this.jogadores){
                System.out.println(jogador.getNome());
            }
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
