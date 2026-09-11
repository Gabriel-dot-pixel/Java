package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class CalculoSalario2 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double salarioHora;
        int horasMes;
        double salarioBruto;
        double INSS;
        double sindicato;
        double IR;
        double salarioLiquido;
        
        System.out.print("Digite quanto voce ganha por hora: R$");
        salarioHora = ler.nextDouble();
        
        System.out.print("Digite quantas horas voce trabalha no mes: ");
        horasMes = ler.nextInt();
        
        salarioBruto = salarioHora * horasMes;
        INSS = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        IR = salarioBruto * 0.11;
        salarioLiquido = salarioBruto - INSS - sindicato - IR;
        
        System.out.println("-------------------------------------------");
        System.out.println("Salario bruto: R$" + salarioBruto);
        
        System.out.println("INSS: R$" + INSS);
        
        System.out.println("Sindicato: R$" + sindicato);
        
        System.out.println("Imposto de Renda: R$" + IR);
        
        System.out.println("Salario Liquido: R$" + salarioLiquido);
        System.out.println("-------------------------------------------");

        ler.close();
    }
}
