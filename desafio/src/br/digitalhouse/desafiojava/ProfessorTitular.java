
package br.digitalhouse.desafiojava;

public class ProfessorTitular extends Professor{

    private String especialidade;

    public ProfessorTitular(String especialidade, String nome, String sobrenome, Integer tempoDeCasa, Integer codigoDoProfessor ) {
        super.nome=nome;
        super.sobrenome=sobrenome;
        super.tempoDeCasa=tempoDeCasa;
        super.codigoDoProfessor=codigoDoProfessor;
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
