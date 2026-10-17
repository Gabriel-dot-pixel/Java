package listaarrays;

import java.util.Scanner;

public class Somatorio15 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+10;
        }
        
        int somaInferior15 = 0;
        int igual15 = 0;
        int somaSuperior15 = 0;
        int superior15 = 0;
        
        for (int i=0; i<10; i++) {
            if (vetor[i] < 15) {
                somaInferior15 += vetor[i];
            } else if (vetor[i] == 15) {
                igual15++;
            } else if (vetor[i] > 15) {
                somaSuperior15 += vetor[i];
                superior15++;
            }
        }
        
        double mediaSuperior15 = (double)somaSuperior15 / superior15;
        
        System.out.println("Soma de todos os numeros inferiores a 15 no vetor: " + somaInferior15);
        System.out.println("Quantidade de elementos iguais a 15 no vetor: " + igual15);
        System.out.println("Media de todos os elementos superiores a 15 no vetor: " + mediaSuperior15);
    }
}
