package OOPS.B_Metodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }
    public void multiplicaDoisNumeros(int num1 , double num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        return num1/num2;
    }
    public void alteraDoisNumeros(int n1, int n2){
        n1 = 10;
        n2 = 20;
        System.out.println(n1);
        System.out.println(n2);
    }

    public void somaArray(int[] arrayDeNumeros){
        int soma = 0;
        for (int i = 0; i < arrayDeNumeros.length; i++) {
            soma = soma + arrayDeNumeros[i];
        }
        System.out.println(soma);
    }

    public void somaVariosArgs(int... arrayDeNumeros){
        int soma = 0;
        for (int i = 0; i < arrayDeNumeros.length; i++) {
            soma = soma + arrayDeNumeros[i];
        }
        System.out.println(soma);
    }
}
