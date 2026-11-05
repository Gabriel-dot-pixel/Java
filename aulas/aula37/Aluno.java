package aula37;

public class Aluno extends Pessoa {

    private String curso;
    private double[][] notas;
    
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
