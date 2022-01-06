package LogicaProgramacao;

public class OperadorTernario {
    public static void main(String[] args){
        double salario = 15000;
        String doar = "irei doar 2000";
        String naoDoar = "não irei doar";
        String resultado = salario > 5000 ? doar : naoDoar;
        System.out.println(resultado);
    }
}
