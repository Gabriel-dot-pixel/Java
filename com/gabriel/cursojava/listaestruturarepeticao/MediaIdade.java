package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class MediaIdade {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int somaIdade = 0;

        System.out.print("Digite uma quantidade de pessoas: ");
        int quant = ler.nextInt();

        for (int i=0; i<quant; i++) {
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = ler.nextInt();

            somaIdade += idade;
        }

        double media = (double)somaIdade/quant;

        System.out.println("A média calculada foi " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("A turma lida é jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma lida é adulta");
        } else {
            System.out.println("A turma lida é idosa");
        }

        ler.close();
    }
}
