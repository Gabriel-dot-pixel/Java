package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class CoversorMedida {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double metros;
        
        System.out.print("Digite uma medida em metros: ");
        metros = ler.nextDouble();
        System.out.println(metros + "m equivale a " + (metros*100) + "cm");
    }
    
}
