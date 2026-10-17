package listaarrays;

public class Pares {

    public static void main(String[] args) {
        
        int[] vetorA = new int[10];
        
        int par = 0;
        
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = i+1;
        }
        
        for (int i=0; i<vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                par++;
            }
        }
        
        System.out.println("Existem " + par + " numeros pares no vetor A");
    }
}
