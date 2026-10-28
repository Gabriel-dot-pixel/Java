package listametodosrecursivos;

public class Somatorio {

    public static int somatorioRecursivo(int num) {
//        System.out.println(num);
        if (num == 1) {
            return 1;
        }
        
        return somatorioRecursivo(num-1) + num;
    }
}
