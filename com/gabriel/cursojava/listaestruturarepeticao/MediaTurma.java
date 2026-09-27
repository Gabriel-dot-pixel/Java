package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class MediaTurma {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int quantAlunos;
        int somaAlunos = 0;

        System.out.print("Digite a quantidade de turmas: ");
        int quantTurmas = ler.nextInt();

        for (int i=0; i<quantTurmas; i++) {
            do {
                System.out.print("Digite a quantidade de alunos na turma " + (i+1) + ": ");
                quantAlunos = ler.nextInt();

                if (quantAlunos > 40) {
                    System.out.println("Não pode haver mais de 40 alunos por turma");
                }
            } while (quantAlunos > 40);

            somaAlunos += quantAlunos;
        }

        double mediaAlunos = (double)somaAlunos/quantTurmas;

        System.out.println("Existe um total de " + mediaAlunos + " alunos por turma");

        ler.close();
    }
}
