package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class Telefonista {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        String resposta;
        int contSim = 0;
        
        System.out.print("Telefonou para a vítima? S - Sim e N - Não: ");
        resposta = ler.nextLine();

        if (resposta.equals("S")) {
            contSim++;
        }

        System.out.print("Esteve no local do crime? S - Sim e N - Não: ");
        resposta = ler.nextLine();

        if (resposta.equals("S")) {
            contSim++;
        }

        System.out.print("Mora perto da vítima? S - Sim e N - Não: ");
        resposta = ler.nextLine();

        if (resposta.equals("S")) {
            contSim++;
        }

        System.out.print("Devia para a vítima? S - Sim e N - Não: ");
        resposta = ler.nextLine();

        if (resposta.equals("S")) {
            contSim++;
        }

        System.out.print("Já trabalhou com a vítima? S - Sim e N - Não: ");
        resposta = ler.nextLine();

        if (resposta.equals("S")) {
            contSim++;
        }

        System.out.print("Sua classificação: ");

        if (contSim == 2) {
            System.out.println("Suspeito(a)");
        } else if (contSim == 3 || contSim == 4) {
            System.out.println("Cúmplice");
        } else if (contSim == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        ler.close();
    }
}
