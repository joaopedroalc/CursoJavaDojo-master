package OOPS.G_Associacao.dominio.Exercicio;

public class Seminario {
    private String tema;
    private Aluno[] alunos;
    private Local local;


    public Seminario(String tema, Aluno[] alunos, Local local) {
        this.tema = tema;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Seminario(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

}
