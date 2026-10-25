package listametodosestaticos;

public class Calculadora {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int subratair(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
    
    public static int elevarPotenciaN(int num1, int num2) {
        int result = 1;
        
        for (int i=0; i<num2; i++) {
            result *= num1;
        }
        
        return result;
    }
    
    public static int fatorial(int num) {
        int fat = 1;

        for (int i=num; i>0; i--) {
            fat *= i;
        }
        
        return fat;
    }
}
