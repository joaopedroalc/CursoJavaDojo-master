package OOPS.B_Metodos.test;

import OOPS.B_Metodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        int a = 60;
        int b = 80;
        Calculadora calculadora02 = new Calculadora();
        calculadora02.alteraDoisNumeros(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
