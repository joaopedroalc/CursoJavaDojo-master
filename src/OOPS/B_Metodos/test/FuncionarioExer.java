package OOPS.B_Metodos.test;

import OOPS.B_Metodos.dominio.Funcionario;

public class FuncionarioExer {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jose");
        funcionario.setIdade(39);
        double[] arrayDeSalarios = {1200.00,2000.00,700.00};
        funcionario.setSalarios(arrayDeSalarios);
//        funcionario.setMedia(3000.00);

        System.out.println("Os dados do funcionário:");
        funcionario.imprimeDados();

        System.out.println("Media " + funcionario.getMedia());

    }
}
