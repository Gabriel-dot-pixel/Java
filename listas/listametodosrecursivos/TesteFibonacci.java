package listametodosrecursivos;

import java.util.Scanner;

public class TesteFibonacci {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        
        System.out.println("O " + num + " termo da sequencia fibonacci e: " + Fibonacci.fibonacciRecursivo(num));
    }
}
