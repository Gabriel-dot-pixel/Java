package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double raio;
        double pi = Math.PI;
        
        System.out.print("Digite o raio de um circulo: ");
        raio = ler.nextDouble();
        
        System.out.println("A area desse ciruclo e " + (pi*(raio*raio)));

        ler.close();
    }
    
}
