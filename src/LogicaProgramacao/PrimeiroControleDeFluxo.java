package LogicaProgramacao;

public class PrimeiroControleDeFluxo {
    public static void main(String[] args) {
       /* double numero = 61;
        if(numero == 30){
            System.out.println(numero);
        }else if(numero % 2 == 0){
            System.out.println(numero*5);
        }else{
            System.out.println(numero/2);
        } */

        int idade = 44;
        String categoria;
        if(idade < 15) {
            categoria = "infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "juvenil";
        }else{
            categoria="Adulto";
        }
        System.out.println(categoria);
    }
}
