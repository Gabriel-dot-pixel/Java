package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class LeitorSexo {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o seu sexo (M | F): ");
        String sexo = ler.nextLine();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido!");
        }

        ler.close();
    }
}
