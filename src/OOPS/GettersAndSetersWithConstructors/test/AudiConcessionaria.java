package OOPS.GettersAndSetersWithConstructors.test;

import OOPS.GettersAndSetersWithConstructors.domain.Carros;

public class AudiConcessionaria {
    public static void main(String[] args) {
        Carros audi = new Carros("Audi");

        Carros carro01 = new Carros(audi.getMarca(),"A4", 2022 );
        Carros carro02 = new Carros("Audi", "Q3", 2008);
        Carros carro03 = new Carros();

        carro03.setMarca("Audi");
        carro03.setModelo("A8");
        carro03.setAno(2001);

        System.out.println("Carro 01 :");
        carro01.imprime();

        System.out.println("Carro 02 :");
        carro02.imprime();

        System.out.println("Carro 03 :");
        System.out.println(carro03.getMarca());
        System.out.println(carro03.getModelo());
        System.out.println(carro03.getAno());
    }
}
