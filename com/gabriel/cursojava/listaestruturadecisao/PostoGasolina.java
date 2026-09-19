package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class PostoGasolina {

    public static void main(String[] args) {
     
        Scanner ler = new Scanner(System.in);

        double valor = 0.0;

        System.out.print("Digite quantos litros de combustível vai abastecer: ");
        double litros = ler.nextDouble();

        System.out.println("Digite o tipo de combustível que vai usar (A - álcool e G - gasolina): ");
        String tipo = ler.nextLine();

        switch (tipo) {
            case "A":
                if (litros <= 20.0) {
                    valor = (1.9 * litros) - ((1.9 * litros) * 0.03);
                } else {
                    valor = (1.9 * litros) - ((1.9 * litros) * 0.05);
                }

                System.out.println("Total a pagar: R$" + valor);
                break;

            case "G":
                if (litros <= 20.0) {
                    valor = (2.5 * litros) - ((2.5 * litros) * 0.04);
                } else {
                    valor = (2.5 * litros) - ((2.5 * litros) * 0.05);
                }

                System.out.println("Total a pagar: R$" + valor);
                break;
        
            default:
                System.out.println("Tipo inválido de combustível");
                break;
        }

        ler.close();
    }
}
