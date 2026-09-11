package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o raio de um circulo: ");
        double raio = ler.nextDouble();

        double area = Math.PI * (raio*raio);
        
        System.out.println("A area desse ciruclo e " + area);

        ler.close();
    }
    
}
