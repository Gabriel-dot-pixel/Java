package listaorientacaoobjeto;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = ler.nextLine();

        System.out.print("Digite a matircula do aluno: ");
        aluno.matricula = ler.nextLine();

        System.out.print("Digite o nome do curso do aluno: ");
        aluno.nomeCurso = ler.nextLine();

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            aluno.disciplinas[i] = ler.nextLine();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                aluno.notasDisciplinas[i][j] = ler.nextDouble();
            }
        }

        aluno.exibirInfo();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            if (aluno.avaliarAprovado(i)) {
                System.out.println("Voce esta aprovado em " + aluno.disciplinas[i]);
            } else {
                System.out.println("Voce esta reprovado em " + aluno.disciplinas[i]);
            }
        }
    }
}
