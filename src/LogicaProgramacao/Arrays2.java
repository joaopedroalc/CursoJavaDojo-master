package LogicaProgramacao;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "João Pedro";
        nomes[1] = "aurelio";
        nomes[2] = "bacabal";
        nomes[3] = "Mjorge";
        nomes[4] = "Andre";

        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }

        int[] numeros = {10,20,30,40};

        for(int n=0;n<numeros.length;n++){
            System.out.println(numeros[n]);
        }

        int[] valores = new int[]{1,2,3,4,5,6,7,8};
        for(int x=0;x<valores.length;x++){
            System.out.println(valores[x]);
        }
    }
}
