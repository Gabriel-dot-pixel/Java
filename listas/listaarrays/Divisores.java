package listaarrays;

public class Divisores {

    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+1;
        }
        
        for (int i=0; i<10; i++) {
            System.out.println("\nA[" + i + "] = " + vetor[i]);
            System.out.print("Divisores: ");
            for (int j=1; j<=vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
