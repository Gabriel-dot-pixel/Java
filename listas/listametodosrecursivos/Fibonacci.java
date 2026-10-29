package listametodosrecursivos;

public class Fibonacci {

    public static int fibonacciRecursivo(int num) {
        if (num < 2) {
            return num;
        }
        
        return fibonacciRecursivo(num-1) + fibonacciRecursivo(num-2);
    }
}
