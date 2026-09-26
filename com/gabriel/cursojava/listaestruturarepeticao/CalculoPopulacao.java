package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class CalculoPopulacao {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double populacaoA = 80000.0;
        double populacaoB = 200000.0;
        int contAnos = 0;

        System.out.println("Se a população de um país A, que é de 80.000 habitantes, cresce 3% a cada ano e a população de um país B, que é de 200.000 habitantes, cresce 1,5% a cada ano, quantos anos levará para a população do país A ultrapassar ou se igualar ao país B?");
        
        while (populacaoA < populacaoB) {
            populacaoA = populacaoA * 1.03;
            populacaoB = populacaoB * 1.015;
            contAnos++;
        }

        System.out.println("Foram necessários " + contAnos + " anos");

        ler.close();
    }
}
