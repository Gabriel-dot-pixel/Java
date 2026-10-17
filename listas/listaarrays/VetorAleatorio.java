package listaarrays;

import java.util.Scanner;

public class VetorAleatorio {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = (int)Math.round(Math.random()*1);
        }
        
        int qtde1 = 0;
        int qtde0 = 0;
        
        for (int i=0; i<10; i++) {
            if (vetor[i] == 0) {
                qtde0++;
            } else {
                qtde1++;
            }
        }
        
        double percentual1 = ((double)qtde1/vetor.length) * 100;
        double percentual0 = ((double)qtde0/vetor.length) * 100;
        
        System.out.println("Percentual de 1's no vetor: " + percentual1 + "%");
        System.out.println("Percentual de 0's no vetor: " + percentual0 + "%");
    }
}
