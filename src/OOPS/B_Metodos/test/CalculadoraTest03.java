package OOPS.B_Metodos.test;

import OOPS.B_Metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora3 = new Calculadora();
        calculadora3.somaArray(new int[]{1,2,3,5});
        int[] array2 = {4,12,23,25};
        calculadora3.somaArray(array2);

        calculadora3.somaVariosArgs(20,30,40);
    }
}
