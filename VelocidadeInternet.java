package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class VelocidadeInternet {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double tamanhoArquivo;
        double velocidadeDownload;
        double tempo;
        
        System.out.print("Digite o tamanho do arquivo em MB: ");
        tamanhoArquivo = ler.nextDouble();
        System.out.print("Digite a velocidade do link de internet em Mbps: ");
        velocidadeDownload = ler.nextDouble();
        
        tempo = ((tamanhoArquivo * 8) / velocidadeDownload) / 60;
        
        System.out.println("O seu arquivo vai demorar " + tempo + " minutos para o download completo");
    }
}
