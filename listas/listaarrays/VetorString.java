package listaarrays;

public class VetorString {

    public static void main(String[] args) {
        
        int[] A = new int[10];
        char[] B = new char[10];
        
        for (int i=0; i<10; i++) {
            A[i] = (int)(Math.random()*15)+1;
        }
        
        for (int i=0; i<10; i++) {
            if (A[i] < 7) {
                B[i] = 'a';
            } else if (A[i] == 7) {
                B[i] = 'b';
            } else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            } else if (A[i] > 10) {
                B[i] = 'e';
            }
        }
        
        for (int i=0; i<10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
