package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class TabelaPreco {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double preco = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int i=1; i<=50; i++) {
            System.out.println(i + " - R$" + preco);
            preco += 1.99;
        }

        ler.close();
    }
}
