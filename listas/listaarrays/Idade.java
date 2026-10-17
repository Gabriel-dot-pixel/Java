package listaarrays;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+30;
        }
        
        int superior35 = 0;
        
        for (int i=0; i<10; i++) {
            if (vetor[i] > 35) {
                superior35++;
            }
        }
        
        System.out.println("Quantidade de pessoas com mais de 35 anos: " + superior35);
    }
}
