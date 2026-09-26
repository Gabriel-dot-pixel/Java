package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class CalculoPopulacao2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String resposta;

        do {
            int contAnos = 0;

            System.out.print("Digite a população do país A: ");
            double populacaoA = ler.nextDouble();

            while (populacaoA < 0) {
                System.out.println("A população não pode ser menor que 0!");
                System.out.print("Digite novamente: ");
                populacaoA = ler.nextDouble();
            }

            System.out.print("Digite a taxa de crescimento da população A (digite em decimal): ");
            double taxaA = ler.nextDouble();

            System.out.print("Digite a população do país B: ");
            double populacaoB = ler.nextDouble();

            while (populacaoA < 0) {
                System.out.println("A população não pode ser menor que 0!");
                System.out.print("Digite novamente: ");
                populacaoB = ler.nextDouble();
            }

            System.out.print("Digite a taxa de crescimento da população B (digite em decimal): ");
            double taxaB = ler.nextDouble();

            while (populacaoA < populacaoB) {
                populacaoA = populacaoA + (populacaoA * taxaA);
                populacaoB = populacaoB + (populacaoB * taxaB);
                contAnos++;
            }

            System.out.println("Foram necessários " + contAnos + " anos para a população A superar ou se igualar a população B");

            System.out.print("Quer repetir a operação (S - sim | N - não)? ");
            resposta = ler.next();

            while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.print("Resposta inválida! Digite novamente: ");
            }
        } while (resposta.equalsIgnoreCase("S"));

        ler.close();
    }
}
