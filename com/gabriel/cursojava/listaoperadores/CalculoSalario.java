package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class CalculoSalario {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite quanto voce ganha por hora: R$");
        double valorHora = ler.nextDouble();
        
        System.out.print("Digite quantas horas voce trabalha no mes: ");
        int horas = ler.nextInt();
        
        System.out.println("Voce ganha R$" + (valorHora*horas) + " por mes");

        ler.close();
    }
    
}
