package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class InteiroDecimal {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = ler.nextDouble();

        if (num % 1 == 0) {
            System.out.println(num + " é um inteiro");
        } else {
            System.out.println(num + " é um decimal");
        }

        ler.close();
    }
}
