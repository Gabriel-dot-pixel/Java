package listaarrays;

import java.util.Scanner;

public class MaiorMenorIdade {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+1;
        }
        
        int menorIdade = vetor[0];
        int posMenorIdade = 0;
        int maiorIdade = vetor[0];
        int posMaiorIdade = 0;
        
        for (int i=0; i<10; i++) {
            if (vetor[i] < menorIdade) {
                menorIdade = vetor[i];
                posMenorIdade = i;
            } else if (vetor[i] > maiorIdade) {
                maiorIdade = vetor[i];
                posMaiorIdade = i;
            }
        }
        
        System.out.println("Menor idade no vetor: " + menorIdade);
        System.out.println("Posicao da menor idade no vetor: " + posMenorIdade);
        System.out.println("Maior idade no vetor: " + maiorIdade);
        System.out.println("Posicao da maior idade no vetor: " + posMaiorIdade);
    }
}
