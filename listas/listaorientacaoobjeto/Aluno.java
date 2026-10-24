package listaorientacaoobjeto;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] disciplinas;
    private double[][] notasDisciplinas;

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.disciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public Aluno() {
    }
    
    public void lerAluno() {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        nome = ler.nextLine();

        System.out.print("Digite a matircula do aluno: ");
        matricula = ler.nextLine();

        System.out.print("Digite o nome do curso do aluno: ");
        nomeCurso = ler.nextLine();

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            disciplinas[i] = ler.nextLine();
        }

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notasDisciplinas[i][j] = ler.nextDouble();
            }
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + nomeCurso);

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
    
    public double calcularMedia(int pos) {
        double soma = 0;
        double media;
        for (int i = 0; i < notasDisciplinas[pos].length; i++) {
            soma += notasDisciplinas[pos][i];
        }
       media = soma / 4;
            
        return media;
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
}
