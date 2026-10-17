package aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        
        System.out.print("Digite um limite: ");
        int max = ler.nextInt();
        
        for (int i=num; i<=max; i++) {
            if (i % 7 == 0) {
                System.out.println("O valor de i e: " + i);
                break;
            }
        }
        
        for (int i=num; i<=max; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i e: " + i);
        }
    }
}
