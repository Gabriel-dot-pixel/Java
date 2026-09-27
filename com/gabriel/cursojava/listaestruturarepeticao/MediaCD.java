package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class MediaCD {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double somaValores = 0;

        System.out.print("Digite a quantidade de CDs: ");
        int quantCD = ler.nextInt();

        for (int i = 0; i < quantCD; i++) {
            System.out.print("Digite o valor pago no CD " + (i + 1) + ": ");
            double valorCD = ler.nextInt();

            somaValores += valorCD;
        }

        double mediaValor = (double) somaValores / quantCD;

        System.out.println("Foi investido um total de R$" + somaValores + " em todos os CDs");
        System.out.println("Foi pago, em média, R$" + mediaValor + " por CD");

        ler.close();
    }
}
