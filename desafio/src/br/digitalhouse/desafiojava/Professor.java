package br.digitalhouse.desafiojava;

import java.util.Objects;

public abstract class Professor {

    protected String nome;
    protected String sobrenome;
    protected Integer tempoDeCasa;
    protected Integer codigoDoProfessor;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(codigoDoProfessor, professor.codigoDoProfessor);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoDoProfessor() {
        return codigoDoProfessor;
    }

    public void setCodigoDoProfessor(Integer codigoDoProfessor) {
        this.codigoDoProfessor = codigoDoProfessor;
    }
}
