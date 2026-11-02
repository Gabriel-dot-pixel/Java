package listarelacionamentos;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {
    }
    
    public String exibirInfo() {
        String info = "Curso: " + this.nome + "\n";
        info += "Horario: " + this.horario + "\n";
        
        if (professor != null) {
            info += this.professor.toString() + "\n";
        }
        
        if (alunos != null) {
            for (Aluno a: alunos) {
                if (a != null) {
                    info += a.exibirInfo() + "\n";
                }
            }
            
            info += "\n" + "Media da Turma: " + calcularMediaTurma();
        }
        
        return info;
    }
    
    public double calcularMediaTurma() {
        double soma = 0;
        
        for (Aluno a: alunos) {
            if (a != null) {
                soma += a.calcularMedia();
            }
        }
        
        return soma/alunos.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
