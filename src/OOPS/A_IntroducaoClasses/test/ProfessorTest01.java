package OOPS.A_IntroducaoClasses.test;

import OOPS.A_IntroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "Claudi";
        professor1.idade = 50;
        professor1.materia = "Matemática";

        System.out.println(professor1.nome + " ministra a disciplina " + professor1.materia);
    }
}
