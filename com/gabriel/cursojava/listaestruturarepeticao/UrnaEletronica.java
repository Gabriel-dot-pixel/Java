package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class UrnaEletronica {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        System.out.print("Digite a quantidade total de eleitores: ");
        int quant = ler.nextInt();

        for (int i=0; i<quant; i++) {
            System.out.print("Digite o voto do eleitor " + (i+1) + " (1 - Canditado 1 | 2 - Candidato 2 | 3 - Candidato 3): ");
            int voto = ler.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;

                case 2:
                    votosCandidato2++;
                    break;

                case 3:
                    votosCandidato3++;
                    break;
            
                default:
                    System.out.println("Voto nulo ou branco");
                    break;
            }
        }

        System.out.println("Quantidade de votos para o Candidato 1: " + votosCandidato1);
        System.out.println("Quantidade de votos para o Candidato 2: " + votosCandidato2);
        System.out.println("Quantidade de votos para o Candidato 3: " + votosCandidato3);

        ler.close();
    }
}
