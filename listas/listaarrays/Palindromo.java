package listaarrays;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            System.out.print("Digite o elemento " + i + " do vetor: ");
            vetor[i] = ler.nextInt();
        }
        
        int iguais = 0;
        
        for (int i=0; i<10; i++) {
            if (vetor[i] == vetor[10-(i+1)]) {
                iguais++;
            }
        }
        
        if (iguais == 10) {
            System.out.println("O vetor e um palindromo");
        } else {
            System.out.println("O vetor nao e um palindromo");
        }
    }
}
