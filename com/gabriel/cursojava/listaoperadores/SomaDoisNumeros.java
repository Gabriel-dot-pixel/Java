package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class SomaDoisNumeros {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int num1 = ler.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int num2 = ler.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

        ler.close();
    }
    
}
