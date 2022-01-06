package LogicaProgramacao;

public class Switch {
    public static void main(String[] args) {
        // imprima os dias da semana com LogicaProgramacao.Switch
        byte dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            default:
                System.out.println("Qualquer dia");
        }
    }
}
