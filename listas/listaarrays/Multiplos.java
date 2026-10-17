package listaarrays;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+1;
        }
        
        int somaVetor = 0;
        
        for (int i=0; i<10; i++) {
            if (vetor[i] % 5 == 0) {
                somaVetor += vetor[i];
            }
        }
        
        System.out.println("A soma de todos os elementos do vetor multiplos de 5 e: " + somaVetor);
    }
}
