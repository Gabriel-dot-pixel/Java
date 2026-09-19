package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class LeitorVogalConsoante {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = ler.nextLine();

        if (letra.length() <= 1) {
            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
                    || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
                System.out.println("É uma vogal");
            } else {
                System.out.println("É uma consoante");
            }
        } else {
            System.out.println("Não é uma letra válida");
        }

        ler.close();
    }
}
