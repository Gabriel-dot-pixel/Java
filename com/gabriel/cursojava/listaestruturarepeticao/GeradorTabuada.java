package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class GeradorTabuada {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int num = ler.nextInt();

        while (num <= 0 || num > 10) {
            System.out.print("Número inválido! Digite novamente: ");
            num = ler.nextInt();
        }

        System.out.println("Tabuada de " + num + ":");
        for (int i=1; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));
        }

        ler.close();
    }
}
