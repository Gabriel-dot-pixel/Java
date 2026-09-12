package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class LeitorVogalConsoante {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = ler.nextLine();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("É uma vogal");
        } else {
            System.out.println("É uma consoante");
        }

        ler.close();
    }
}
