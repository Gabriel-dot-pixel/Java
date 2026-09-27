package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class NumeroPrimo3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int div = 0;

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        System.out.println("Os números primos entre 1 e " + num + " são:");
        for (int i = 1; i <= num; i++) {
            int cont = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }

                div++;
            }

            if (cont == 2) {
                if (i != 1 && i != num) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println("\nForam realizadas " + div + " divisões para achar os números primos");

        ler.close();
    }
}
