package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class LeitorSexo {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o seu sexo (M - Masculino | F - Feminino): ");
        String sexo = ler.nextLine();

        if (sexo.equals("M")) {
            System.out.println("Masculino");
        } else if (sexo.equals("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido!");
        }

        ler.close();
    }
}
