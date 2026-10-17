package listaarrays;

import java.util.Scanner;

public class PercentualParImpar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+1;
        }
        
        int qtdePares = 0;
        int qtdeImpares = 0;
        
        for (int i=0; i<10; i++) {
            if (vetor[i] % 2 != 0) {
                qtdeImpares++;
            } else {
                qtdePares++;
            }
        }
        
        double percentualPares = ((double)qtdePares/vetor.length) * 100;
        double percentualImpares = ((double)qtdeImpares/vetor.length) * 100;
        
        System.out.println("Percentual de numeros pares no vetor: " + percentualPares + "%");
        System.out.println("Percentual de numeros pares no vetor: " + percentualImpares + "%");
    }
}
