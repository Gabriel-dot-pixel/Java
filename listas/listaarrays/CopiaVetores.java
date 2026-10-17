package listaarrays;

import java.util.Scanner;

public class CopiaVetores {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = i+1;
        }
        
        for (int i=0; i<vetorB.length; i++) {
            vetorB[i] = i+5;
        }
        
        for (int i=0; i<vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        
        for (int i=0; i<vetorC.length; i++) {
            System.out.println("Posicao " + i + " do vetor C e: " + vetorC[i]);
        }
    }
}
