package listaestruturarepeticao;

import java.util.Scanner;

public class Intervalo3 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num;
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;
        
        do {
            System.out.print("Digite um numero (digite um numero negativo para finalizar): ");
            num = ler.nextInt();
            
            if (num >= 0 && num <= 25) {
                intervalo1++;
            } else if (num >= 26 && num <= 50) {
                intervalo2++;
            } else if (num >= 51 && num <= 75) {
                intervalo3++;
            } else if (num >= 76 && num <= 100) {
                intervalo4++;
            }
        } while (num >= 0);
        
        System.out.println("Quantidade de numeros digitados entre 0 e 25: " + intervalo1);
        System.out.println("Quantidade de numeros digitados entre 26 e 50: " + intervalo2);
        System.out.println("Quantidade de numeros digitados entre 51 e 75: " + intervalo3);
        System.out.println("Quantidade de numeros digitados entre 76 e 100: " + intervalo4);
    }
}
