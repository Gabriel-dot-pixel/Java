package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class MediaN {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int somaNota = 0;

        System.out.print("Digite quantas notas você quer ler: ");
        int quant = ler.nextInt();

        for (int i=0; i<quant; i++) {
            System.out.print("Digitie a nota " + (i+1) + ": ");
            double nota = ler.nextDouble();

            somaNota += nota;
        }

        double media = (double)somaNota/quant;

        System.out.println("A media de todas as notas é " + media);

        ler.close();
    }
}
