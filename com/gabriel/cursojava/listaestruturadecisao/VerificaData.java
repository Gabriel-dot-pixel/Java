package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class VerificaData {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dia = ler.nextLine();
        String mes = ler.nextLine();
        String ano = ler.nextLine();

        String data = dia + mes + ano;

        System.out.println(data);

        ler.close();
    }
}
