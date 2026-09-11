package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class ControlePeixe {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double pesoPeixe;
        double multa = 0;
        double excesso = 0;
        
        System.out.print("Digite o peso total dos peixes: ");
        pesoPeixe = ler.nextDouble();
        
        if (pesoPeixe > 50) {
            excesso = pesoPeixe - 50;
            multa = excesso * 4;
        }
        
        System.out.println("Peso total de peixes: " + pesoPeixe);
        System.out.println("Excesso: " + excesso);
        System.out.println("Multa a pagar: R$" + multa);
        
        
    }
}
