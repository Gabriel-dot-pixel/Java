package listametodosrecursivos;

public class Somatorio {

    public static int somatorioRecursivo(int num) {
        if (num == 1) {
            return 1;
        }
        
        return somatorioRecursivo(num-1) + num;
    }
}
