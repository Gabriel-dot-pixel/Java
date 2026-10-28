package listametodosrecursivos;

public class Fibonacci {

    public static int fibonacciRecursivo(int num) {
        if (num == 2) {
            return 1;
        }
        
        if (num == 1) {
            return 0;
        }
        
        return fibonacciRecursivo(num-2) + fibonacciRecursivo(num-1);
    }
}
