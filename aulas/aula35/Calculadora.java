package aula35;

public class Calculadora {
    
    public static int fatorialNaoRecursivo(int num) {
        int fat = 1;
        
        if (num == 0) {
            return 1;
        }

        for (int i=num; i>1; i--) {
            fat *= i;
            System.out.println(fat);
        }
        
        return fat;
    }
    
    public static int fatorialRecursivo(int num) {
        if (num == 0) {
            return 1;
        }
        
        System.out.println(num);
        
        return num * fatorialRecursivo(num-1);
    }
}
