package listaorientacaoobjeto;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] disciplinas;
    private double[][] notasDisciplinas;
    
    public Aluno() {
        this.disciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.disciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }
    
    public void lerAluno() {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        this.nome = ler.nextLine();

        System.out.print("Digite a matircula do aluno: ");
        this.matricula = ler.nextLine();

        System.out.print("Digite o nome do curso do aluno: ");
        this.nomeCurso = ler.nextLine();

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            this.disciplinas[i] = ler.nextLine();
        }

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                this.notasDisciplinas[i][j] = ler.nextDouble();
            }
        }
    }

    public void exibirInfo() {
        String informacoes = toString();
        System.out.println(informacoes);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean avaliarAprovado(int pos) {
        if (calcularMedia(pos) >= 7.0) {
            return true;
        }
        
        return false;
    }
    
    private double calcularMedia(int pos) {
        double soma = somarNotas(pos);
        double media = soma / 4;
            
        return media;
    }
    
    private double somarNotas(int pos) {
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[pos].length; i++) {
            soma += notasDisciplinas[pos][i];
        }
        
        return soma;
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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n"
               + "Matricula: " + this.matricula + "\n" 
               + "Curso: " + this.nomeCurso;
    }
}
