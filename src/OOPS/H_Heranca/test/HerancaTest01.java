package OOPS.H_Heranca.test;

import OOPS.H_Heranca.dominio.Endereco;
import OOPS.H_Heranca.dominio.Funcionario;
import OOPS.H_Heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Fran Pacheco");
        endereco.setCep("65073-800");

        Pessoa pessoa = new Pessoa("joao");
        pessoa.setCpf("042.954.463-43");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("jose",3000);
        funcionario.setCpf("424.232.322-56");
        funcionario.setEndereco(endereco);
        System.out.println("------------------------");
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
