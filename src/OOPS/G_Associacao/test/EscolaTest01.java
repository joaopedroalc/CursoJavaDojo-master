package OOPS.G_Associacao.test;

import OOPS.G_Associacao.dominio.Escola;
import OOPS.G_Associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Paulo Rogerio", "obstetra");
        Professor professor02 = new Professor("Gereba", "obstetra");

        Professor[] professor = new Professor[]{professor01, professor02};
        Escola escola = new Escola("Dom pedro II", professor);

        escola.imprime();
    }
}
