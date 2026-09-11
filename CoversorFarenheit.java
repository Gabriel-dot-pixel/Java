package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class CoversorFarenheit {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double farenheit;
        double celsius;
        
        System.out.print("Digite uma temperatura em graus Farenheit: ");
        farenheit = ler.nextDouble();
        
        celsius = 5 * (farenheit - 32) / 9;
        
        System.out.println("Convertento para graus Celsius fica " + celsius);
    }
    
}
