package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do lado a: ");
        double a = ler.nextDouble();

        System.out.print("Digite o valor do lado b: ");
        double b = ler.nextDouble();

        System.out.print("Digite o valor do lado c: ");
        double c = ler.nextDouble();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("É um trinângulo");

            if (a == b && a == c && b == c) {
                System.out.println("Forma um triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Forma um triângulo Isósceles");
            } else if (a != b && a != c && b != c) {
                System.out.println("Forma um triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

        ler.close();
    }
}
