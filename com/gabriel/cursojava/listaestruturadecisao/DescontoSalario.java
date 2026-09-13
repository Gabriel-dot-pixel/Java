package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class DescontoSalario {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double IR;

        System.out.print("Digite quanto você ganha por hora: R$");
        double valoHora = ler.nextDouble();

        System.out.print("Digite quantas horas você trabalha por mês: ");
        int horas = ler.nextInt();

        double salarioBruto = valoHora * horas;

        if (salarioBruto <= 900.0) {
            IR = 0.0;
        } else if (salarioBruto <= 1500.0) {
            IR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500.0) {
            IR = salarioBruto * 0.10;
        } else {
            IR = salarioBruto * 0.20;
        }

        double INSS = salarioBruto * 0.10;
        double sindicato = salarioBruto * 0.03;
        double FGTS = salarioBruto * 0.11;
        double descontos = IR + INSS + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("-------------------------------------------");
        System.out.println("Salário Bruto: R$" + salarioBruto);
        if (IR == 0.0) {
            System.out.println("Imposto de Renda: Isento");
        } else {
            System.out.println("Imposto de Renda: R$" + IR);
        }
        System.out.println("INSS: R$" + INSS);
        System.out.println("Sindicato: R$" + sindicato);
        System.out.println("FGTS: R$" + FGTS);
        System.out.println("Total de descontos: R$" + descontos);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
        System.out.println("-------------------------------------------");

        ler.close();
    }
}
