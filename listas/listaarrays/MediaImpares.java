package listaarrays;

import java.util.Scanner;

public class MediaImpares {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+1;
        }
        
        int somaImpares = 0;
        int qtdeImpares = 0;
        
        for (int i=0; i<10; i++) {
            if (vetor[i] % 2 != 0) {
                qtdeImpares++;
                somaImpares += vetor[i];
            }
        }
        
        double media = (double)somaImpares/qtdeImpares;
        
        System.out.println("A media aritimetica de todos os numeros impares do vetor e: " + media);
    }
}
