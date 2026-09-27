package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class ConjuntoNumeros {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int menor = 0;
        int maior = 0;
        int soma = 0;

        System.out.print("Digite quantos numeros você quer ler: ");
        int quant = ler.nextInt();

        for (int i=0; i<quant; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int num = ler.nextInt();

            if (i == 0) {
                menor = num;
                maior = num;
            }

            if (num < menor) {
                menor = num;
            } else if (num > maior) {
                maior = num;
            }

            soma += num;
        }

        System.out.println("O menor número é " + menor);
        System.out.println("O maior número é " + maior);
        System.out.println("A soma de todos os números digitados é " + soma);

        ler.close();
    }
}
