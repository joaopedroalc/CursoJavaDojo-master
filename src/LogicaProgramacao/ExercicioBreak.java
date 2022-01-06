package LogicaProgramacao;

public class ExercicioBreak {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int numero = 1; numero <= valorMax; numero++) {
            if (numero > 25) {
                break;
            }
            System.out.println(numero);
        }
    }
}
