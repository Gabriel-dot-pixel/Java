package listaclasses;

public class Disciplina {

    private String nome;
    private double[] notas;
    private int qtdeNotas;

    public Disciplina() {
    }

    public Disciplina(String nome) {
        this.nome = nome;
        this.notas = new double[4];
        this.qtdeNotas = 0;
    }
    
    public boolean adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10 && qtdeNotas < notas.length) {
            notas[qtdeNotas] = nota;
            qtdeNotas++;
            return true;
        }
        
        return false;
    }
    
    public double calcularMedia() {
        double soma = 0;
        for (int i=0; i<notas.length; i++) {
            soma += notas[i];
        }
        
        double media = soma / notas.length;
        
        return media;
    }
    
    public boolean verificarAprovacao() {
        if (calcularMedia() >= 7 && notasCompletas()) {
            return true;
        }
        
        return false;
    }
    
    public boolean notasCompletas() {
        return qtdeNotas == notas.length;
    }
    
    public void mostrarNotas() {
        if (notasCompletas()) {
            for (int i=0; i<notas.length; i++) {
                System.out.println("Nota " + (i+1) + ": " + notas[i]);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
