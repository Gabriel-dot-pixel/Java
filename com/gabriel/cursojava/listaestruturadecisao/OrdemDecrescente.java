package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class OrdemDecrescente {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);

            if (num2 > num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);

            if (num1 > num3) {
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num1);
            }
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);

            if (num2 > num1) {
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num1);
                System.out.println(num2);
            }
        }

        ler.close();
    }
}
