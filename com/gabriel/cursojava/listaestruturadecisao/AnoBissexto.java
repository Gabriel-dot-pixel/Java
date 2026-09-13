package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = ler.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println(ano + " é ano bissexto");
                } else {
                    System.out.println(ano + " não é ano bissexto");
                }
            } else {
                System.out.println(ano + " não é ano bissexto");
            }
        } else {
            System.out.println(ano + " não é ano bissexto");
        }

        ler.close();
    }
}
