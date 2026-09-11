package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class ConversorMedida {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma medida em metros: ");
        double metros = ler.nextDouble();
        System.out.println(metros + "m equivale a " + (metros*100) + "cm");

        ler.close();
    }
    
}
