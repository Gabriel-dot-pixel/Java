package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class LeitorTurno {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o turno em que você estuda (M - Matutino | V - Vespertino | N - Noturno): ");
        String turno = ler.nextLine();

        switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            
            case "V":
                System.out.println("Boa tarde!");
                break;

            case "N":
                System.out.println("Boa noite!");
                break;
        
            default:
                System.out.println("Valor inválido!");
                break;
        }

        ler.close();
    }
}
