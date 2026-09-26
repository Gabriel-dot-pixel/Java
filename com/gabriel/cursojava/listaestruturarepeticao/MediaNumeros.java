package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class MediaNumeros {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int soma = 0;

        for (int i=0; i<5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int num = ler.nextInt();

            soma += num;
        }

        double media = (double)soma/5;

        System.out.println("A soma dos 5 números é " + soma);
        System.out.println("A media dos 5 números é " + media);

        ler.close();
    }
}
