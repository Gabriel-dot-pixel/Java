package listametodosrecursivos;

import java.util.Scanner;

public class TesteSomatorio {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        
        System.out.println("O somatorio de 1 ate " + num + " e: " + Somatorio.somatorioRecursivo(num));
    }
}
