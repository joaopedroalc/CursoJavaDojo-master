package OOPS.A_IntroducaoClasses.test;

import OOPS.A_IntroducaoClasses.dominio.Carro;

public class CarroExercicio01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Ferrai";
        carro01.modelo = "conversivel";
        carro01.ano = 2019;
        System.out.println(carro01.nome + "," + carro01.modelo+ "," + carro01.ano);
    }
}
