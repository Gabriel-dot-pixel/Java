package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class VelocidadeInternet {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = ler.nextDouble();
        System.out.print("Digite a velocidade do link de internet em Mbps: ");
        double velocidadeDownload = ler.nextDouble();
        
        double tempo = ((tamanhoArquivo * 8) / velocidadeDownload) / 60;
        
        System.out.println("O seu arquivo vai demorar " + tempo + " minutos para o download completo");

        ler.close();
    }
}
