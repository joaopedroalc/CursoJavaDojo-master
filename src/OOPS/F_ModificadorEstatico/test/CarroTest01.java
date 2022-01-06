package OOPS.F_ModificadorEstatico.test;

import OOPS.F_ModificadorEstatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",200);
        Carro c2 = new Carro("Camaro",180);
        Carro c3 = new Carro("Audi",210);

        Carro.setVelocidadeLimite(350);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
