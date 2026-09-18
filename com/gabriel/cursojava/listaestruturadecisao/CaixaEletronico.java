package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite quanto você quer sacar (valor mínimo R$10 e máximo R$600): R$");
        int valor = ler.nextInt();

        if (valor >= 10 && valor <= 600) {
            int notas100 = valor / 100;
            int resto =  valor % 100;

            int notas50 = resto / 50;
            resto = resto % 50;

            int notas10 = resto / 10;
            resto = resto % 10;

            int notas5 = resto / 5;
            resto = resto % 5;

            int notas1 = resto / 1;

            if (notas100 > 0) {
                System.out.println(valor + " = " + notas100 + " nota(s) de 100, " + notas50 + " nota(s) de 50, " + notas10 + " nota(s) de 10, " + notas5 + " nota(s) de 5 e " + notas1 + " nota(s) de 1");
            } else if (notas50 > 0) {
                System.out.println(valor + " = " + notas50 + " nota(s) de 50, " + notas10 + " nota(s) de 10, " + notas5 + " nota(s) de 5 e " + notas1 + " nota(s) de 1");
            } else if (notas10 > 0) {
                System.out.println(valor + " = " + notas10 + " nota(s) de 10, " + notas5 + " nota(s) de 5 e " + notas1 + " nota(s) de 1");
            } else if (notas5 > 0){
                System.out.println(valor + " = " + notas5 + " nota(s) de 5 e " + notas1 + " nota(s) de 1");
            } else {
                System.out.println(valor + " = " + notas1 + " nota(s) de 1");
            }
        } else {
            System.out.println("Quantidade inválida para saque");
        }

        ler.close();
    }
}
