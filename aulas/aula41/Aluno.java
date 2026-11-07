package aula41;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;
    
    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }
    
    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereco do Aluno: ";
        s += super.getEndereco();
        
        return s;
    }
    
    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
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
}
