package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class Intervalo2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        System.out.println("Números compreendidos entre " + num1 + " e " + num2);
        for (int i=num1+1; i<num2; i++) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\nA soma entre todos os numeros é " + soma);

        ler.close();
    }
}
