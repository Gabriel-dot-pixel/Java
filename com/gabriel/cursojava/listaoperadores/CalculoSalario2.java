package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class CalculoSalario2 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite quanto voce ganha por hora: R$");
        double valorHora = ler.nextDouble();
        
        System.out.print("Digite quantas horas voce trabalha no mes: ");
        int horas = ler.nextInt();
        
        double salarioBruto = valorHora * horas;
        double INSS = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double IR = salarioBruto * 0.11;
        double descontos = INSS + sindicato + IR;
        double salarioLiquido = salarioBruto - descontos;
        
        System.out.println("-------------------------------------------");
        System.out.println("Salario bruto: R$" + salarioBruto);
        
        System.out.println("INSS: R$" + INSS);
        
        System.out.println("Sindicato: R$" + sindicato);
        
        System.out.println("Imposto de Renda: R$" + IR);

        System.out.println("Total Descontado: R$" + descontos);
        
        System.out.println("Salario Liquido: R$" + salarioLiquido);
        System.out.println("-------------------------------------------");

        ler.close();
    }
}
