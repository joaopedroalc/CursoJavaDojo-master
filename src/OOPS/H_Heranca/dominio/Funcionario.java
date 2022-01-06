package OOPS.H_Heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.setCpf("999.089.999-89");
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("eu me chamo " + this.nome + " e recebi " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
