package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class ValidacaoInformacoes {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um nome com mais de três caracteres: ");
        String nome = ler.next();

        while (nome.length() < 3) {
            System.out.println("O nome digitado possui menos de três caracteres!");
            System.out.print("Digite novamente: ");
            nome = ler.next();
        }

        System.out.print("Digite uma idade entre 0 e 150 anos: ");
        int idade = ler.nextInt();

        while (idade < 0 || idade > 150) {
            if (idade < 0) {
                System.out.println("A idade digitada é menor que 0!");
            } else if (idade > 150) {
                System.out.println("A idade digitada é maior que 150!");
            }

            System.out.print("Digite novamente: ");
            idade = ler.nextInt();
        }

        System.out.print("Digite um salário maior que 0: ");
        double salario = ler.nextDouble();

        while (salario < 0) {
            System.out.println("O salário digitado é menor que 0!");
            System.out.print("Digite novamente: ");
            salario = ler.nextDouble();
        }

        System.out.print("Digite um sexo (m - Masculino | f - Feminino): ");
        String sexo = ler.next();

        while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
            System.out.print("Sexo inválido! Digite novamente: ");
            sexo = ler.next();
        }

        System.out.print("Digite seu estado (s - solteiro(a) | c - casado(a) | v - viúvo(a) | d - divorciado(a)): ");
        String estado = ler.next();

        while (!estado.equalsIgnoreCase("s") && !estado.equalsIgnoreCase("c") && !estado.equalsIgnoreCase("v") && !estado.equalsIgnoreCase("d")) {
            System.out.print("Estado inválido! Digite novamente: ");
            estado = ler.next();
        }

        ler.close();

    }
}
