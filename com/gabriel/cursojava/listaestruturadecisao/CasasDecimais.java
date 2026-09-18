package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class CasasDecimais {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 1000: ");
        int num = ler.nextInt();

        int unidade = num % 10;
        int dezena = (num / 10) % 10;
        int centena = (num / 100) % 10;
        int milhar = (num / 1000) % 10;

        if (milhar > 0) {
            System.out.println(num + " = " + milhar + " milhar(es), " + centena + " centena(s), " +  dezena + " dezena(s) e " + unidade + " unidade(s)");
        } else if (centena > 0) {
            System.out.println(num + " = " + centena + " centena(s), " +  dezena + " dezena(s) e " + unidade + " unidade(s)");
        } else if (dezena > 0) {
            System.out.println(num + " = " + dezena + " dezena(s) e " + unidade + " unidade(s)");
        } else {
            System.out.println(num + " = " + unidade + " unidade(s)");
        }

        ler.close();
    }
}
