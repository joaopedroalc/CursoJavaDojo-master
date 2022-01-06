package OOPS.G_Associacao.dominio.Exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if(seminarios !=null){
            for (Seminario seminario : this.seminarios){
                System.out.println(seminario.getTema());
                System.out.println(seminario.getLocal().getEndereco());
                for(Aluno aluno : seminario.getAlunos()){
                    System.out.println("Aluno:" + aluno.getNome() + ",idade:" + aluno.getIdade());
                }
            }
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
