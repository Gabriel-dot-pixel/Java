package listaarrays;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+1;
        }
        
        int somaVetor = 0;
        
        for (int i=0; i<10; i++) {
            somaVetor += vetor[i];
        }
        
        System.out.println("A soma de todos os elementos do vetor e: " + somaVetor);
    }
}
