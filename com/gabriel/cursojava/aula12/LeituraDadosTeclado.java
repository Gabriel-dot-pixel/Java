package com.gabriel.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        /*
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = ler.nextLine();
        System.out.println("Seu nome completo e " + nomeCompleto);
        
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = ler.next();
        System.out.println("Seu primeiro nome e " + primeiroNome);
        
        System.out.print("Digite a sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Voce tem " + idade + " anos");
        
        System.out.print("Digite a sua altura: ");
        double altura = ler.nextDouble();
        System.out.println("Voce tem " + altura + " metros");
        */
        
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimacao:");
        String primeiroNome = ler.next();
        int idade = ler.nextInt();
        byte qtdeFilhos = ler.nextByte();
        float altura = ler.nextFloat();
        boolean temPet = ler.nextBoolean();
        System.out.println("Voce digitou os seguintes valores:");
        System.out.println("Primeiro nome..........: " + primeiroNome);
        System.out.println("Idade..........: " + idade);
        System.out.println("Quantidade de filhos...: " + qtdeFilhos);
        System.out.println("Altura.................: " + altura);
        System.out.println("Tem animal de estimacao: " + temPet);

        ler.close();
    }
}
