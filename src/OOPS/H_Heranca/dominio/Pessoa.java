package OOPS.H_Heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("dentro do bloco estatico de Pessoa");
    }

    {
        System.out.println("bloco de inicialização Pessoa1");
    }

    {
        System.out.println("bloco de inicialização Pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("dentro do construtor Pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + "," + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
