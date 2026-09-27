package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        int f = 1;

        System.out.print(num + "! = ");

        for (int i=num; i>0; i--) {
            System.out.print(i);

            if (i > 1) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }

            f *= i;
        }

        System.out.println(f);

        ler.close();
    }
}
