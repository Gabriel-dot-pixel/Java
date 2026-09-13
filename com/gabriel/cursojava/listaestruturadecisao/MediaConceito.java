package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class MediaConceito {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        String conceito;

        System.out.print("Digite sua nota parcial 1: ");
        double nota1 = ler.nextDouble();

        System.out.print("Digite sua nota parcial 2: ");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media <= 4.0) {
            conceito = "E";
        } else if (media <= 6.0) {
            conceito = "D";
        } else if (media <= 7.5) {
            conceito = "C";
        } else if (media <= 9.0) {
            conceito = "B";
        } else {
            conceito = "A";
        }

        System.out.println("--------------------------------------------");
        System.out.println("Nota Parcial 1: " + nota1);
        System.out.println("Nota Parcial 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
        System.out.println("--------------------------------------------");

        ler.close();
    }
}
