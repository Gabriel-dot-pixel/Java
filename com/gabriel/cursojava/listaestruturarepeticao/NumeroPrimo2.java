package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class NumeroPrimo2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int cont = 0;

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        for (int i=1; i<=num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println(num + " é número primo");
        } else {
            System.out.println(num + " não é número primo");
            System.out.println(num + " é divisivel por: ");
            for (int i=1; i<num+1; i++) {
                if (num % i == 0) {
                    if (i != 1 && i != num){
                        System.out.print(i + " ");
                    }
                }
            }
        }

        ler.close();
    }
}
