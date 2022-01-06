package LogicaProgramacao;

public class Operadores {
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        System.out.println("A soma é: " + numero1+numero2);
        //O java pega o operador de soma e muda para concatenação pois o primeiro elemento a ser impresso é uma string
        System.out.println("A soma é: " + (numero1+numero2));
        //jeito correto de se obter a soma, os parenteses dão a ordem de preferencia para a operação e não para a concatenação
        System.out.println("A soma é: " + soma);
        //podemos guardar o valor da soma em uma variavel
        System.out.println("A divisão é: " + (numero1/numero2));
        // o resultado deu 0 pois as variaveis são do tipo int se quisermos para imprimir o valor em decimal temos que colocar em double ou float
        //divisão
        double n1 = 50;
        double n2 = 100;
        System.out.println("A divisão é: " + (n1/n2));
        //Resto da divisão
        System.out.println("Resto da divisão é: " + (200%12));
    }
}
