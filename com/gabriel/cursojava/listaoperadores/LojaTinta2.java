package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class LojaTinta2 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double area;
        double litros;
        double latas;
        double galoes;
        double precoLata;
        double precoGalao;
        
        System.out.print("Digite a area a ser pintada: ");
        area = ler.nextDouble();
        
        litros = area / 6;
        latas = litros / 18;
        galoes = litros / 3.6;
        precoLata = latas * 80;
        precoGalao = galoes * 25;
        
        System.out.println("Se voce comprar somente latas de tinta:");
        System.out.println("Voce vai precisar de " + latas + " latas");
        System.out.println("Voce vai pagar R$" + precoLata);
        System.out.println("---------------------------------------------------");
        System.out.println("Se voce comprar somente galoes de tinta:");
        System.out.println("Voce vai precisar de " + galoes + " galoes");
        System.out.println("Voce vai pagar R$" + precoGalao);

        ler.close();
    }
}
