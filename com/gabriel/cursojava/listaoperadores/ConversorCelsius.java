package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class ConversorCelsius {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double farenheit;
        double celsius;
        
        System.out.print("Digite uma temperatura em graus Celsius: ");
        celsius = ler.nextDouble();
        
        farenheit = (celsius * 1.8) + 32;
        
        System.out.println("Convertento para graus Farenheit fica " + farenheit);

        ler.close();
    }
    
}
