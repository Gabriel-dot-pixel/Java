package listaarrays;

import java.util.Scanner;

public class CopiaVetor3 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = i+1;
        }
        
        for (int i=0; i<vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        
        for (int i=0; i<vetorB.length; i++) {
            System.out.println("Posicao " + i + " do vetor B e: " + vetorB[i]);
        }
    }
}
