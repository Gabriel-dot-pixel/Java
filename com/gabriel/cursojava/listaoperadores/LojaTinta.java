package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class LojaTinta {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double area;
        double litros;
        double latas;
        double preco;
        
        System.out.print("Digite a area a ser pintada: ");
        area = ler.nextDouble();
        
        litros = area / 3;
        latas = litros / 18;
        preco = latas * 80;
        
        System.out.println("Voce vai precisar de " + latas + " latas de tinta");
        System.out.println("Voce vai pagar R$" + preco);

        ler.close();
    }
}
