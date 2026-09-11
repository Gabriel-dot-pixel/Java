package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class LeitorNumero {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = ler.nextInt();
        
        System.out.println("O numero informado foi " + numero);

        ler.close();
    }
    
}
