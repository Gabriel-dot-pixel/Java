package listarelacionamentos;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }
    
    public String exibirInfo() {
        double soma = 0;
        String info = "Aluno: " + this.nome + "\n";
        info += "Matricula: " + this.matricula + "\n";
        info += "Notas: ";
        
        for (double nota: notas) {
            soma += nota;
            info += nota + " ";
        }
        
        info += "\n";
        info += "Media: " + (soma/4) + " - ";
        
        if ((soma/4) >= 7) {
            info += "Aprovado!" + "\n";
        } else {
            info += "Reprovado!" + "\n";
        }
        return info;
    }
    
    public double calcularMedia() {
        double soma = 0;
        
        for (double nota: notas) {
            soma += nota;
        }
        
        return soma/notas.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
