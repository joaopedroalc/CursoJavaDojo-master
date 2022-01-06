package OOPS.G_Associacao.test;

import OOPS.G_Associacao.dominio.Exercicio.Aluno;
import OOPS.G_Associacao.dominio.Exercicio.Local;
import OOPS.G_Associacao.dominio.Exercicio.Professor;
import OOPS.G_Associacao.dominio.Exercicio.Seminario;

public class Sistema {
    public static void main(String[] args) {
        Local local = new Local("Teatro");
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("marcos", 23);
        Professor professor = new Professor("José Marques", "Biologo");
        Aluno[] alunosSeminario = {aluno1};
        Aluno[] alunosSeminario2 = {aluno1, aluno2};

        Seminario seminario = new Seminario("Imunologia", alunosSeminario, local);
        Seminario seminario2 = new Seminario("Endocrinologia", alunosSeminario2, local);

        Seminario[] seminariosDisponiveis = {seminario, seminario2};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
