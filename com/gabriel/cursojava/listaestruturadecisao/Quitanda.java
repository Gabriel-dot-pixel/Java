package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class Quitanda {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double precoMorango;
        double precoMaca;

        System.out.print("Digite quantos kg de morango vai comprar: ");
        double quiloMorango = ler.nextDouble();

        System.out.print("Digite quantos kg de maçã vai comprar: ");
        double quiloMaca = ler.nextDouble();

        if (quiloMorango <= 5.0) {
            precoMorango = quiloMorango * 2.5;
        } else {
            precoMorango = quiloMorango * 2.2;
        }

        if (quiloMaca <= 5.0) {
            precoMaca = quiloMaca * 1.8;
        } else {
            precoMaca = quiloMaca * 1.5;
        }

        double quiloTotal = quiloMorango + quiloMaca;
        double precoTotal = precoMorango + precoMaca;

        if (quiloTotal > 8.0 || precoTotal > 25.0) {
            precoTotal = precoTotal - (precoTotal * 0.10);
        }

        System.out.println("Total a pagar: R$" + precoTotal);

        ler.close();
    }
}
