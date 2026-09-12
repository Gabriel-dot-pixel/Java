package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class ComparaPreco {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = ler.nextDouble();

        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = ler.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = ler.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Compre o primeiro produto, porque está mais barato");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Compre o segundo produto, porque está mais barato");
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("Compre o terceiro produto, porque está mais barato");
        }

        ler.close();
    }
}
