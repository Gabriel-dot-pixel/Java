package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double altura;
        double imc;
        
        System.out.print("Digite a sua altura: ");
        altura = ler.nextDouble();
        
        imc = (72.7 * altura) - 58;
        
        System.out.println("Seu peso ideal e " + imc + "kg");

        ler.close();
    }
    
}
