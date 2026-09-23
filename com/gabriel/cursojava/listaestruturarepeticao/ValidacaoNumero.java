package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class ValidacaoNumero {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 10: ");
        int num = ler.nextInt();

        while (num < 0 || num > 10) {
            System.out.print("Valor inválido! Digite novamente: ");
            num = ler.nextInt();
        }

        ler.close();
    }
}
