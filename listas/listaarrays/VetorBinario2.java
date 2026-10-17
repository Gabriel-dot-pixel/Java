package listaarrays;

public class VetorBinario2 {

    public static void main(String[] args) {
        
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        
        for (int i=0; i<10; i++) {
            A[i] = (int)(Math.random()*10)+1;
            B[i] = (int)(Math.random()*10)+1;
        }
        
        for (int i=0; i<10; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else if (A[i] < B[i]) {
                C[i] = -1;
            }
        }
        
        for (int i=0; i<10; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}
