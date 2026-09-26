package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class ImprimindoNumeros {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Imprimindo números de 1 a 20, um abaixo do outro:");

        for (int i=1; i<=20; i++) {
            System.out.println(i);
        }

        System.out.println("Imprimindo números de 1 a 20, um ao lado do outro:");
        for (int i=1; i<=20; i++) {
            System.out.print(i + " ");
        }

        ler.close();
    }
}
