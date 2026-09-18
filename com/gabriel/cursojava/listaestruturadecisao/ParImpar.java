package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é ímpar");
        }

        ler.close();
    }
}
