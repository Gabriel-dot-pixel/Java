package listaarrays;

import java.util.Scanner;

public class SepararVetor2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[20];
        int[] B = new int[20];
        
        for (int i=0; i<20; i++) {
            System.out.print("Digite o elemento " + i + " do vetor A: ");
            A[i] = ler.nextInt();
        }
        
        int posB = 0;
        
        for (int i=0; i<20; i++) {
            if (A[i] % 2 == 0) {
                B[posB] = A[i];
                posB++;
            }
        }
        
        for (int i=0; i<20; i++) {
            if (A[i] % 2 != 0) {
                B[posB] = A[i];
                posB++;
            }
        }

        for (int i=0; i<20; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
