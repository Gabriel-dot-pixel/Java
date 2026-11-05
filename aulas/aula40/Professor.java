package aula40;

public class Professor extends Pessoa {

    private String departamento;
    private double salario;
    private String nomeCurso;
    
    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereco do Professor: ";
        s += super.getEndereco();
        
        return s;
    }
    
    public double calcularSalarioLiquido() {
        return 0;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
