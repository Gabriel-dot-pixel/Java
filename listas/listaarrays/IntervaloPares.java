package listaarrays;

public class IntervaloPares {

    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+1;
        }
        
        for (int i=0; i<10; i++) {
            System.out.println("\nA[" + i + "] = " + vetor[i]);
            System.out.print("Pares: ");
            for (int j=0; j <= vetor[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
