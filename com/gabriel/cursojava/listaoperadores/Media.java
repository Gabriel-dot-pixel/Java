package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a nota 1: ");
        double nota1 = ler.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        double nota2 = ler.nextDouble();
        
        System.out.print("Digite a nota 3: ");
        double nota3 = ler.nextDouble();
        
        System.out.print("Digite a nota 4: ");
        double nota4 = ler.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A media de todas as notas e " + media);

        ler.close();
    }
    
}
