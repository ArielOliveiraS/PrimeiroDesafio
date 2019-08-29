package br.digitalhouse.desafiojava;

public class ProfessorAdjunto extends Professor {

    private Integer horasDeMonitoria;

    public ProfessorAdjunto(Integer horasDeMonitoria, String nome, String sobrenome, Integer tempoDeCasa, Integer codigoDoProfessor) {
        super.nome=nome;
        super.sobrenome=sobrenome;
        super.tempoDeCasa=tempoDeCasa;
        super.codigoDoProfessor=codigoDoProfessor;
        this.horasDeMonitoria = horasDeMonitoria;
    }

    public Integer getHorasDeMonitoria() {
        return getHorasDeMonitoria();
    }

    public void setHorasDeMonitoria(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
