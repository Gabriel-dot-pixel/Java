package listaclasses;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private Disciplina[] disciplinas;
    private int qtdeDisciplinas;

    public Aluno() {
    }
    
    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new Disciplina[5];
        this.qtdeDisciplinas = 0;
    }
    
    public void lerAluno() {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        this.nome = ler.nextLine();
        
        System.out.print("Digite a matricula do aluno: ");
        this.matricula = ler.nextInt();
        ler.nextLine();
        
        System.out.print("Digite o curso do aluno: ");
        this.curso = ler.nextLine();
        
        do {
            System.out.print("Digite a quantidade de disciplinas que o aluno esta inscrito (maximo 5): ");
            this.qtdeDisciplinas = ler.nextInt();
            
            if (this.qtdeDisciplinas > 5) {
                System.out.println("O aluno nao pode estar inscrito em mais de 5 disciplinas!");
            }
        } while (this.qtdeDisciplinas > 5);
        
        for (int i=0; i<this.qtdeDisciplinas; i++) {
            Disciplina d = new Disciplina();
            
            System.out.print("Digite o nome da disciplina " + (i+1) + ": ");
            String nomeDisc = ler.nextLine();
            
            d.setNome(nomeDisc);
            
            adicionarDisciplina(d);
        }
    }
    
    public boolean adicionarDisciplina(Disciplina disciplina) {
        if (disciplina != null && qtdeDisciplinas <= disciplinas.length) {
            disciplinas[qtdeDisciplinas] = disciplina;
            qtdeDisciplinas++;
            return true;
        }
        return false;
    }
    
    public Disciplina consultarDisciplina(int pos) {
        if (pos >= 0 && pos < qtdeDisciplinas) {
            return disciplinas[pos];
        }
        return null;
    }
    
    public double calcularMediaGeral() {
        double soma = 0;
        int disciplinasCompletas = 0;
        
        for (int i=0; i<qtdeDisciplinas; i++) {
            if (disciplinas[i].notasCompletas()) {
                soma += disciplinas[i].calcularMedia();
                disciplinasCompletas++;
            }
        }
        
        if (disciplinasCompletas > 0) {
            double mediaGeral = soma / disciplinasCompletas;
            return mediaGeral;
        }
        
        return 0;
    }

    public void mostrarBoletim() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do Curso: " + curso);

        for (int i=0; i<qtdeDisciplinas; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);
            disciplinas[i].mostrarNotas();;
            double media = disciplinas[i].calcularMedia();
            System.out.println("Media: " + media);
            boolean aprovado = disciplinas[i].verificarAprovacao();
            if (aprovado) {
                System.out.println("Situacao: Aprovado");
            } else {
                System.out.println("Situacao: Reprovado");
            }
        }
        
        double mediaGeral = calcularMediaGeral();
        
        System.out.println("Media Geral: " + mediaGeral);
    }


    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}

