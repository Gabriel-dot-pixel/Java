package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class ImprimindoImpares {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Números ímpares entre 1 e 50:");
        for (int i=1; i<=50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        ler.close();
    }
}
