package OOPS.A_IntroducaoClasses.test;

import OOPS.A_IntroducaoClasses.dominio.Carro;

public class CarroExercicio02 {
    public static void main(String[] args) {
        Carro carro02 = new Carro();
        carro02.nome = "Audi";
        carro02.modelo = "a8";
        carro02.ano = 2021;
        System.out.println(carro02.nome + "," + carro02.modelo+ "," + carro02.ano);
    }
}
