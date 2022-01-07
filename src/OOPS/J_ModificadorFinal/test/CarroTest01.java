package OOPS.J_ModificadorFinal.test;

import OOPS.J_ModificadorFinal.dominio.Carro;
import OOPS.J_ModificadorFinal.dominio.Comprador;
import OOPS.J_ModificadorFinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("pedro");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("merda");
        ferrari.imprime();
    }
}
