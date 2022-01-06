package LogicaProgramacao;

public class Inicializacao {
    public static void main(String[] args) {
        System.out.println("\nPrimeiro Array : ");
        int[] array1 = {45,55};

        int[][] arrayInteiros = new int[3][];
        arrayInteiros[0] = array1;
        arrayInteiros[1] = new int[]{10,20,30};
        arrayInteiros[2] = new int[4];

        for (int[] arrayBase : arrayInteiros){
            System.out.println("\n--------------");
            for(int num:arrayBase){
                System.out.print(num + " ");
            }
        }
        System.out.println("\nSegundo Array : ");
        int[][] arrayInt2 = {{1,1}, {2,3,10}, {4,55,28}};
        for (int[] arrayBase : arrayInt2){
            System.out.println("\n--------------");
            for(int i=0;i<arrayBase.length;i++){
                System.out.print(arrayBase[i] + " ");
            }
        }
    }
}
