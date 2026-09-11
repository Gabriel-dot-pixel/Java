package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class OperadorNumeros {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num1 = ler.nextInt();

        System.out.print("Digite outro numero inteiro: ");
        int num2 = ler.nextInt();
        
        System.out.print("Digite um numero real: ");
        double num3 = ler.nextDouble();
        
        System.out.println("Produto do dobro do primeiro com metade do segundo: " + ((num1*2)*((double)num2/2)));
        System.out.println("Soma do triplo do primeiro com o terceiro: " + ((num1*3) + num3));
        System.out.println("Terceiro elevado ao cubo: " + (num3*num3*num3));

        ler.close();
    }
    
}
