package com.gabriel.cursojava.listaestruturadecisao;

import java.util.Scanner;

public class Hipermercado {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double preco = 0;
        int opcPagamento;
        int parcelas;

        System.out.println("Tipos de carne que você pode comprar: ");
        System.out.println("1 - File Duplo");
        System.out.println("2 - ALcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o a opção de carne que você quer comprar: ");
        int opcCarne = ler.nextInt();

        if (opcCarne >= 1 && opcCarne <= 3) {
            System.out.print("Digite quantos kg da carne você quer comprar: ");
            double kg = ler.nextDouble();

            if (opcCarne == 1) {
                if (kg <= 5.0) {
                    preco = kg * 4.9;
                } else {
                    preco = kg * 5.8;
                }
            } else if (opcCarne == 2) {
                if (kg <= 5.0) {
                    preco = kg * 5.9;
                } else {
                    preco = kg * 6.8;
                }
            } else if (opcCarne == 3) {
                if (kg <= 5.0) {
                    preco = kg * 6.9;
                } else {
                    preco = kg * 7.8;
                }
            }

            System.out.println("Possiveis formas de pagamento:");
            System.out.println("1 - Cartão Tabajara");
            System.out.println("2 - Cartão de Crédito");
            System.out.println("3 - Cartão de Débito");
            System.out.println("4 - Dinheiro");
            System.out.print("Digite a opcão de pagamento: ");
            opcPagamento = ler.nextInt();

            if (opcPagamento == 1) {
                System.out.println("----------------------------------------");
                System.out.println("              Nota Fiscal               ");
                System.out.print("Tipo da carne comprada: ");
                if (opcCarne == 1) {
                    System.out.println("File Duplo");
                } else if (opcCarne == 2) {
                    System.out.println("Alcatra");
                } else if (opcCarne == 3) {
                    System.out.println("Picanha");
                }
                System.out.println("Quantidade comprada: " + kg + "kg");
                System.out.println("Valor total: R$" + preco);
                System.out.println("Forma de pagamento: Cartão Tabajara");
                System.out.println("Valor do desconto: R$" + (preco * 0.05));
                System.out.println("Total a pagar: R$" + (preco - (preco * 0.05)));
                System.out.println("----------------------------------------");
            } else if (opcPagamento == 2) {
                System.out.println("Digite a quantidade de parcelas: ");
                parcelas = ler.nextInt();

                System.out.println("----------------------------------------");
                System.out.println("              Nota Fiscal               ");
                System.out.print("Tipo da carne comprada: ");
                if (opcCarne == 1) {
                    System.out.println("File Duplo");
                } else if (opcCarne == 2) {
                    System.out.println("Alcatra");
                } else if (opcCarne == 3) {
                    System.out.println("Picanha");
                }
                System.out.println("Quantidade comprada: " + kg + "kg");
                System.out.println("Valor total: R$" + preco);
                System.out.println("Forma de pagamento: Cartão de Crédito");
                System.out.println("Quantidade de parcelas: " + parcelas);
                System.out.println("Valor das parcelas: " + (preco/parcelas));
                System.out.println("Valor do desconto: R$0,0");
                System.out.println("Total a pagar: R$" + preco);
                System.out.println("----------------------------------------");
            } else if (opcPagamento == 3) {
                System.out.println("----------------------------------------");
                System.out.println("              Nota Fiscal               ");
                System.out.print("Tipo da carne comprada: ");
                if (opcCarne == 1) {
                    System.out.println("File Duplo");
                } else if (opcCarne == 2) {
                    System.out.println("Alcatra");
                } else if (opcCarne == 3) {
                    System.out.println("Picanha");
                }
                System.out.println("Quantidade comprada: " + kg + "kg");
                System.out.println("Valor total: R$" + preco);
                System.out.println("Forma de pagamento: Cartão de Débito");
                System.out.println("Valor do desconto: R$0,0");
                System.out.println("Total a pagar: R$" + preco);
                System.out.println("----------------------------------------");
            } else if (opcPagamento == 4){
                System.out.println("----------------------------------------");
                System.out.println("              Nota Fiscal               ");
                System.out.print("Tipo da carne comprada: ");
                if (opcCarne == 1) {
                    System.out.println("File Duplo");
                } else if (opcCarne == 2) {
                    System.out.println("Alcatra");
                } else if (opcCarne == 3) {
                    System.out.println("Picanha");
                }
                System.out.println("Quantidade comprada: " + kg + "kg");
                System.out.println("Valor total: R$" + preco);
                System.out.println("Forma de pagamento: Dinheiro");
                System.out.println("Valor do desconto: R$0,0");
                System.out.println("Total a pagar: R$" + preco);
                System.out.println("----------------------------------------");
            } else {
                System.out.println("Forma de pagamento inválida");
            }
        } else {
            System.out.println("Não estamos vendendo esse tipo de carne");
        }

        ler.close();
    }
}
