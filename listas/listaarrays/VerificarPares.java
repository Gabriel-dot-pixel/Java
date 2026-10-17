package listaarrays;

import java.util.Scanner;

public class VerificarPares {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = (int)(Math.random()*100)+1;
        }
        
        int pos = 0;
        boolean lFlag = false;
        
        do {
            if (vetor[pos] % 2 == 0) {
                pos++;
            } else {
                lFlag = true;
                System.out.println("Existe um elemento impar no vetor");
            }
        } while (!lFlag && pos < 10);
    }
}
