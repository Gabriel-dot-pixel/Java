package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class AreaQuadrado {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double lado;
        double area;
        
        System.out.print("Digite o lado de um quadrado: ");
        lado = ler.nextDouble();
        
        area = lado * lado;
        
        System.out.println("A area desse quadrado e " + area + " e seu dobro e " + (area*2));

        ler.close();
    }
    
}
