package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double novoSalario;
        double aumento;

        System.out.print("Digite o seu salário atual: R$");
        double salarioAtual = ler.nextDouble();

        System.out.println("----------------------------------------------");
        System.out.println("Salário atual: R$" + salarioAtual);

        if (salarioAtual <= 280.0) {
            System.out.println("Percentual de aumento: 20%");
            novoSalario = salarioAtual * 1.20;
            aumento = salarioAtual * 0.20;
        } else if (salarioAtual <= 700.0) {
            System.out.println("Percentual de aumento: 15%");
            novoSalario = salarioAtual * 1.15;
            aumento = salarioAtual * 0.15;
        } else if (salarioAtual <= 1500.0) {
            System.out.println("Percentual de aumento: 10%");
            novoSalario = salarioAtual * 1.10;
            aumento = salarioAtual * 0.10;
        } else {
            System.out.println("Percentual de aumento: 5%");
            novoSalario = salarioAtual * 1.05;
            aumento = salarioAtual * 0.05;
        }

        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Salário após o aumento: R$" + novoSalario);
        System.out.println("----------------------------------------------");

        ler.close();
    }
}
