package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class Fatorial2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String resposta;

        do {
            System.out.print("Digite um número: ");
            int num = ler.nextInt();

            while (num < 0 || num > 16) {
                if (num < 0) {
                    System.out.println("Não é possivel calcular fatorial de números negativos!");
                    System.out.print("Digite novamente: ");
                    num = ler.nextInt();
                } else if (num > 16) {
                    System.out.println("O fatorial de números maiores que 16 é muito grande para calcular");
                    System.out.print("Digite novamente: ");
                    num = ler.nextInt();
                }
            }

            int f = 1;

            System.out.print(num + "!=");

            for (int i = num; i > 0; i--) {
                System.out.print(i);

                if (i > 1) {
                    System.out.print(".");
                } else {
                    System.out.print("=");
                }

                f *= i;
            }

            System.out.println(f);

            System.out.print("Você quer calcular outro número (S - sim | N - não)?: ");
            resposta = ler.next();

            while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.print("Resposta inválida! Digite novamente: ");
                resposta = ler.next();
            }
        } while (resposta.equalsIgnoreCase("S"));

        ler.close();
    }
}
