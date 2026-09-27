package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int resultado = 1;

        System.out.print("Digite o primeiro número: ");
        int base = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int expoente = ler.nextInt();

        for (int i=1; i<=expoente; i++) {
            resultado *= base;
        }

        System.out.println("O resultado da exponenciação é " + resultado);

        ler.close();
    }
}
