package OOPS.B_Metodos.test;

import OOPS.B_Metodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome="fulano";
        estudante.idade=17;
        estudante.sexo='M';
        estudante.imprimeDiretoDentroDaClasse();
    }
}
