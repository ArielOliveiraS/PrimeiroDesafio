package br.digitalhouse.desafiojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codigoDoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaDeAlunos;

    List<Aluno> listaDeAlunosMatriculados = new ArrayList<>();

    public Curso(String nome, Integer codigoDoCurso, Integer quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos=quantidadeMaximaDeAlunos;
        this.nome = nome;
        this.codigoDoCurso = codigoDoCurso;
    }

    public Boolean adicionarAluno(Aluno aluno){
        if (getQuantidadeMaximaDeAlunos() + 1 < getQuantidadeMaximaDeAlunos()){
            return true;
        }else { 
            return false;
        }
    }

    public void excluirAluno(Aluno aluno){
        listaDeAlunosMatriculados.remove(aluno);
        System.out.println("O aluno " + aluno + " foi removido da lista;");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDoCurso, curso.codigoDoCurso);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(Integer quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }
}


