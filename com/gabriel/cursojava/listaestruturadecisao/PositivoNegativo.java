package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class PositivoNegativo {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        if (num > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

        ler.close();
    }
}
