package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class ConversorCelsius {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma temperatura em graus Celsius: ");
        double celsius = ler.nextDouble();
        
        double farenheit = (celsius * 1.8) + 32;
        
        System.out.println("Convertento para graus Farenheit fica " + farenheit);

        ler.close();
    }
    
}
