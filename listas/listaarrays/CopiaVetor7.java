package listaarrays;

import java.util.Scanner;

public class CopiaVetor7 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        
        for (int i=0; i<10; i++) {
            System.out.print("Digite o elemento " + i + " do vetor A: ");
            A[i] = ler.nextInt();
        }
        
        for (int i=0; i<10; i++) {
            B[i] = A[10-(i+1)];
        }
        
        for (int i=0; i<10; i++) {
            System.out.print("A[" + i + "] = " + A[i]);
            System.out.println("   |    B[" + i + "] = " + B[i]);
        }
    }
}
