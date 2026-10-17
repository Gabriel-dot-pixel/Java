package listaarrays;

public class Potenciacao {

    public static void main(String[] args) {
        
        int[] vetor = new int[11];
        
        for (int i=0; i<11; i++) {
            vetor[i] = (int)Math.pow(2, i);
        }
        
        for (int i=0; i<11; i++) {
            System.out.println("A[" + i + "] = " + vetor[i]);
        }
    }
}
