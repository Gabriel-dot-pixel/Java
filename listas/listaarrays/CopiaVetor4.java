package listaarrays;

import java.util.Scanner;

public class CopiaVetor4 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        double[] vetorB = new double[15];
        
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = i+1;
        }
        
        for (int i=0; i<vetorA.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        for (int i=0; i<vetorB.length; i++) {
            System.out.println("Posicao " + i + " do vetor B e: " + vetorB[i]);
        }
    }
}
