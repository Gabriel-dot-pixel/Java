package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class AreaQuadrado {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o lado de um quadrado: ");
        double lado = ler.nextDouble();
        
        double area = lado * lado;
        
        System.out.println("A area desse quadrado e " + area + " e seu dobro e " + (area*2));

        ler.close();
    }
    
}
