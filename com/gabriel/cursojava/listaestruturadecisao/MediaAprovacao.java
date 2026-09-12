package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class MediaAprovacao {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a nota parcial 1: ");
        double nota1 = ler.nextDouble();
        
        System.out.print("Digite a nota parcial 2: ");
        double nota2 = ler.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("A media e " + media);

        if (media < 7.0) {
            System.out.println("Reprovado");
        } else if (media < 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Aprovado com Distinção");
        }

        ler.close();
    }
}
