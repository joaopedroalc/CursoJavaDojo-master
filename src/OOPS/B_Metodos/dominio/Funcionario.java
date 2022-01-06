package OOPS.B_Metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public double getMedia() {
        return media;
    }

//    public void setMedia(double media) {
//        this.media = media;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        int salarioAcumulado = 0;
        for(double salario:this.salarios){
            salarioAcumulado += salario;
        }
        System.out.println(salarioAcumulado);
        mediaDosSalarios();
    }
    public void mediaDosSalarios(){
        for (int i = 0; i < salarios.length; i++) {
            media += salarios[i];
        }
        media /= salarios.length;
        System.out.println(media);
    }
}
