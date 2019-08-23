package br.digitalhouse.desafiojava;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professors = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();
    List<Matricula> matriculas = new ArrayList<>();

    public void registrarCurso(Curso curso){
        cursos.add(curso);
    }

    public void excluirCurso(Curso curso){
        cursos.remove(curso);
    }

    public void registrarProfessorAdjunto(ProfessorAdjunto professorAdjunto){

    }

    public void registrarProfessorTitular(ProfessorTitular professorTitular){

    }
    public void excluirProfessor(Professor professor){

    }
    public void matricularAluno(String nome, String sobrenome, Integer codigoDoALuno){

    }

    public void matricularAluno(Integer codigoDoAluno, Integer codigoDoCurso){

    }

    public void alocarProfessores(Integer codigoDoCurso, Integer codigoProfessorTitular, Integer codigoDoProfessorAdjunto){

    }
}
