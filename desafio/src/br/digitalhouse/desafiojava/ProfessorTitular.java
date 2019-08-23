package br.digitalhouse.desafiojava;

public class ProfessorTitular extends Professor{

    private String especialidade;



    public ProfessorTitular(String especialidade, String nome, String sobrenome ) {
        super.nome=nome;
        super.sobrenome=sobrenome;
        this.especialidade = especialidade;

    }
}
