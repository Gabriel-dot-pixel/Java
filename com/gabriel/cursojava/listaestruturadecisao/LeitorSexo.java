package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class LeitorSexo {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o seu sexo (M - Masculino | F - Feminino): ");
        String sexo = ler.next();

        switch (sexo) {
            case "M":
                System.out.println("Masculino");
                break;

            case "F":
                System.out.println("Feminino");
                break;
        
            default:
                System.out.println("Sexo inválido!");
                break;
        }

        ler.close();
    }
}
