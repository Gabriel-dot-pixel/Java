package listaarrays;

public class Tabuada {

    public static void main(String[] args) {
        
        int[] vetor = new int[5];
        
        for (int i=0; i<5; i++) {
            vetor[i] = i+1;
        }
        
        for (int i=0; i<5; i++) {
            System.out.println("Tabuada do " + vetor[i] + ":");
            for (int j=0; j<=10; j++) {
                System.out.println(vetor[i] + " X " + j + " = " + (vetor[i]*j));
            }
        }
    }
}
