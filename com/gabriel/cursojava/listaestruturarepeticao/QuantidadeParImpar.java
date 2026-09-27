package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class QuantidadeParImpar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int num;
        int contPar = 0;
        int contImpar = 0;

        for (int i=0; i<10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            num = ler.nextInt();

            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        System.out.println("Quantidade de números pares digitados: " + contPar);
        System.out.println("Quantidade de números ímpares digitados: " + contImpar);

        ler.close();
    }
}
