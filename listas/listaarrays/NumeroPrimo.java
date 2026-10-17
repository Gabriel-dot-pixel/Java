package listaarrays;

public class NumeroPrimo {

    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        for (int i=0; i<10; i++) {
            vetor[i] = i+1;
        }
        
        for (int i=0; i<5; i++) {
            System.out.print("A[" + i + "] = " + vetor[i] + " - ");
            int cont = 0;
            for (int j=1; j<=vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    cont++;
                }
            }
            
            if (cont == 2) {
                System.out.println("Numero Primo");
            } else {
                System.out.println("Nao e Numero primo");
            }
        }
    }
}
