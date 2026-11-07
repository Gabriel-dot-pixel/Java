package aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno  {

    private String curso;
    private double[] notas;
    
    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }
    
    //@Override
    public String obterEtiquetaEndereco() {
        String s = "Endereco do Aluno: ";
        //s += super.getEndereco();
        
        return s;
    }
    
    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
    
    public void metodoQualquer() {
        //super.setCpf("1234");
        
        //this.setCpf("1234");
    }
    
    public double calcularMedia() {
        return 0;
    }
    
    public boolean verificarAprovado() {
        return true;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
//    @Override
//    public String toString() {
//        String s = this.curso + "\n";
//        
//        for (double nota: this.notas) {
//            s += nota + " ";
//        }
//        
//        return s;
//    }

    @Override
    public String toString() {
        String s = "";
        
        for (double nota: this.notas) {
            s += nota + " ";
        }
        return "Aluno: " + "\n"
               + "Curso: " + this.curso + "\n"
               + "Notas: " + s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        
        if (this.curso.equalsIgnoreCase(other.getCurso())) {
            return true;
        }
        
        return false;
    }
}
