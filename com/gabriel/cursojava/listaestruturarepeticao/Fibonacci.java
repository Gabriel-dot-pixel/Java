package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int prim = 0;
        int sec = 1;
        int cont = 0;
        int prox;

        System.out.print("Digite quantos termos da sequencia fibonacci você quer ver: ");
        int termo = ler.nextInt();

        System.out.print(prim + " ");
        System.out.print(sec + " ");

        while (cont < termo) {
            prox = prim + sec;
            prim = sec;
            sec = prox;
            System.out.print(prox + " ");
            cont++;
        }

        ler.close();
    }
}
