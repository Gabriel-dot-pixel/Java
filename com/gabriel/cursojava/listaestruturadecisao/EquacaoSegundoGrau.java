package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double x1;
        double x2;

        System.out.print("Digite o valor do coeficiente a: ");
        double a = ler.nextDouble();

        if (a != 0) {
            System.out.print("Digite o valor do coeficiente b: ");
            double b = ler.nextDouble();

            System.out.print("Digite o valor do coeficiente c: ");
            double c = ler.nextDouble();

            double delta = (b * b) - 4 * a * c;

            if (delta < 0) {
                System.out.println("O delta é negativo, portanto não existem raízes reais");
                System.out.println("Encerrando o programa...");
            } else if (delta == 0) {
                x1 = -(b / (2 * a));
                
                System.out.println("X = " + x1);
            } else {
                x1 = -((b + Math.sqrt(delta)) / (2 * a));
                x2 = -((b - Math.sqrt(delta)) / (2 * a));

                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        } else {
            System.out.println("O coeficiente a é igual a zero, portanto a equação não é mais do segundo grau");
            System.out.println("Encerrando o programa...");
        }

        ler.close();
    }
}
