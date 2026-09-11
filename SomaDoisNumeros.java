package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class SomaDoisNumeros {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Digite o primeiro numero: ");
        num1 = ler.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        num2 = ler.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    
}
