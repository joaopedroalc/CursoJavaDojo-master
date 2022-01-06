package OOPS.B_Metodos.test;

import OOPS.B_Metodos.dominio.Estudante;
import OOPS.B_Metodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante01.nome = "Bia";
        estudante01.idade = 10;
        estudante01.sexo = 'F';

        imprimeEstudante.imprime(estudante01);

        estudante02.nome = "Dora";
        estudante02.idade = 12;
        estudante02.sexo = 'F';

        imprimeEstudante.imprime(estudante02);
    }
}
