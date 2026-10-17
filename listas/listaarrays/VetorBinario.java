package listaarrays;

public class VetorBinario {

    public static void main(String[] args) {
        
        int[] A = new int[10];
        int[] B = new int[10];
        
        for (int i=0; i<10; i++) {
            A[i] = i+1;
        }
        
        for (int i=0; i<10; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
        }
        
        for (int i=0; i<10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
