package br.digitalhouse.desafiojava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
    private Aluno aluno;
    private Curso curso;
    private Date dataDeMatricula;

    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professores = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();
    List<Matricula> matriculas = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoDoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoDoCurso, quantidadeMaximaDeAlunos);
        cursos.add(curso);
        System.out.println("Curso cadastrado com sucesso");
    }

    public void excluirCurso(String nome, Integer codigoDoCurso, Professor professor, Integer quantidadeMaximaDeAlunos) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigoDoCurso().equals(codigoDoCurso)) {
                cursos.remove(cursos.get(i));
                System.out.println("Curso removido");
            } else {
                System.out.println("Curso não encontrado.");
            }
        }
    }

    public void registrarProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        professores.add(professorAdjunto);
        System.out.println(" Professor Adjunto registrado");
    }

    public void registrarProfessorTitular(ProfessorTitular professorTitular) {
        professores.add(professorTitular);
        System.out.println(" Professor Titular registrado");
    }

    public void excluirProfessor(Integer codigoDoProfessor) {
        if (professores.contains(codigoDoProfessor)) {
            professores.remove(codigoDoProfessor);
            System.out.println(" Professor removido");
        } else {
            System.out.println(" Este professor não faz parte da Digital House");
        }
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoDoAluno) {
        Aluno novoAluno = new Aluno(nome, sobrenome, codigoDoAluno);
        alunos.add(novoAluno);
        System.out.println("Aluno matriculado");
    }

    public void matricularAluno(Integer codigoDoAluno, Integer codigoDoCurso) {
        Curso curso = null;
        Aluno aluno = null;
        Matricula matricula;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigoDoCurso().equals(codigoDoCurso)) {
                curso = cursos.get(i); }}
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCodigoDoAluno().equals(codigoDoAluno)) {
                aluno = alunos.get(i); }}

            if (curso.adicionarAluno(aluno)) {
               matricula = new Matricula(aluno, curso,dataDeMatricula);
                matriculas.add(matricula);
                System.out.println("Aluno matriculado");
            } else {
                System.out.println("Vagas esgotadas");}
    }


    public void alocarProfessores(Integer codigoDoCurso, Integer codigoProfessorTitular, Integer
            codigoDoProfessorAdjunto) {

        ProfessorTitular professorTitular = null;
        ProfessorAdjunto professorAdjunto = null;
        for (int i = 0; i < professores.size(); i++) {
            if (professores.contains(codigoProfessorTitular) && professores.contains(codigoDoProfessorAdjunto)) {
                if (professores.get(i).getCodigoDoProfessor().equals(codigoProfessorTitular)) {
                    professorTitular = (ProfessorTitular) professores.get(i); }
                if (professores.get(i).getCodigoDoProfessor().equals(codigoDoProfessorAdjunto)) {
                    professorAdjunto = (ProfessorAdjunto) professores.get(i); }
            }
            curso.setProfessorTitular(professorTitular);
            curso.setProfessorAdjunto(professorAdjunto);
        }
    }

}