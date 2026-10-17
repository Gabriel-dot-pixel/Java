package listaarrays;

import java.util.Scanner;

public class JuncaoVetores {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];
        
        for (int i=0; i<10; i++) {
            System.out.print("Digite o elemento " + i + " do vetor A: ");
            A[i] = ler.nextInt();
            
            System.out.print("Digite o elemento " + i + " do vetor B: ");
            B[i] = ler.nextInt();
        }
        
        for (int i=0; i<20; i++) {
            if (i <= 9) {
                C[i] = A[i];
            } else {
                C[i] = B[i-10];
            }
        }
        
        for (int i=0; i<20; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}
