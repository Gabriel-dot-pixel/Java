package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class ComparaNumero3 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é o maior");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O terceiro número é o maior");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O primeiro número é o menor");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O segundo número é o menor");
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("O terceiro número é o menor");
        }

        ler.close();
    }
}
