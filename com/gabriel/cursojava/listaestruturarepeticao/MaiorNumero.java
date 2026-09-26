package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int maior = 0;

        for (int i=0; i<5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int num = ler.nextInt();

            if (i == 0) {
                maior = num;
            }

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é " + maior);

        ler.close();
    }
}
