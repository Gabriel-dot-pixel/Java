package aula39.teste;

import aula39.Pessoa;

public class Aluno extends Pessoa {

    private String curso;
    private double[][] notas;
    
    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }
    
    public void verificarAcesso() {
        this.nomeVisivel = "dscdsc";
        super.nomeVisivel = "dscdsc";
        
        super.setNomeVisivel("dscdsc");
    }
    
    public void metodoQualquer() {
        super.setCpf("1234");
        
        this.setCpf("1234");
    }
    
    public double calcularMedia() {
        return 0;
    }
    
    public boolean verificarAprovado() {
        return true;
    }

    public String getCursos() {
        return curso;
    }

    public void setCursos(String curso) {
        this.curso = curso;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
}
