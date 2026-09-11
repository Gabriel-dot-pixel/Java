package com.gabriel.cursojava.listaoperadores;

import java.util.Scanner;

public class IMC2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double altura;
        String sexo;
        double imc;
        double peso;

        System.out.print("Digite a sua altura: ");
        altura = ler.nextDouble();
        System.out.print("Digite o seu sexo: ");
        sexo = ler.next();

        if (sexo == "M") {
            imc = (72.7 * altura) - 58;
        } else {
            imc = (62.1 * altura) - 44.7;
        }

        System.out.print("Digite o seu peso: ");
        peso = ler.nextDouble();

        if (peso == imc) {
            System.out.println("Seu peso ideal e " + imc + "kg e voce esta dentro do peso");
        } else if (peso > imc) {
            System.out.println("Seu peso ideal e " + imc + "kg e voce esta acima do peso");
        } else {
            System.out.println("Seu peso ideal e " + imc + "kg e voce esta abaixo do peso");
        }
    }

}
