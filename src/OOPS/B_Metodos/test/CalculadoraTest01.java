package OOPS.B_Metodos.test;

import OOPS.B_Metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10,5.5);
        double valor = calculadora.divideDoisNumeros(5.8,2.4);
        System.out.println(valor);
    }
}
