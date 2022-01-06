package OOPS.G_Associacao.dominio;

public class Professor {
    private String nome;

    public Professor(String nome, String obstetra) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
