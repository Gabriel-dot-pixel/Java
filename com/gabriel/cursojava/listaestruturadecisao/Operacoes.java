package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double resultado = 0;

        System.out.print("Digite um número: ");
        double num1 = ler.nextDouble();

        System.out.print("Digite outro número: ");
        double num2 = ler.nextDouble();

        System.out.println("====== Menu de Operações =====");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite uma das operações que você quer realizar: ");
        int opc = ler.nextInt();

        switch (opc) {
            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                resultado = num1 / num2;
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }

        if (opc >= 1 && opc <= 4) {
            if (resultado % 2 == 0) {
                System.out.print(resultado + " é par, ");
            } else {
                System.out.print(resultado + " é ímpar, ");
            }

            if (resultado > 0) {
                System.out.print("positivo e ");
            } else {
                System.out.print("negativo e ");
            }

            if (resultado % 1 == 0) {
                System.out.println("inteiro");
            } else {
                System.out.println("decimal");
            }
        } else {
            System.out.println("Finalizando programa...");
        }

        ler.close();
    }
}
