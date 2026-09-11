package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class CalculoSalario {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double salarioHora;
        int horasMes;
        
        System.out.print("Digite quanto voce ganha por hora: R$");
        salarioHora = ler.nextDouble();
        
        System.out.print("Digite quantas horas voce trabalha no mes: ");
        horasMes = ler.nextInt();
        
        System.out.println("Voce ganha R$" + (salarioHora*horasMes) + " por mes");

        ler.close();
    }
    
}
