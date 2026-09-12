package com.gabriel.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        /*
        System.out.print("Digite a sua idade: ");
        int idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }
        */
        
        System.out.print("Digite o preço de um produto: ");
        double preco = ler.nextDouble();

        if (preco <= 10){
            System.out.println("Está barato, pode comprar");
        } else if (preco < 15){
            System.out.println("Pode pedir um desconto");
        } else if (preco <= 17){
            System.out.println("Recomendo pesquisar mais");
        } else {
            System.out.println("Está caro, não compre");
        }

        ler.close();
    }
}
