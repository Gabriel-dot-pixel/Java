package aula49;

public class TestandoFinally {
    
    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};
        
        for (int i=0; i<numeros.length; i++) {
            try{
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            } catch (ArithmeticException e) {
                System.out.println("Excecao ao tentar fazer divisao por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Excecao ao tentar acessar uma posicao no vetor denominadores que nao existe");
            } finally {
                System.out.println("Essa linha e impressa sempre apos o try ou catch");
            }
        }
    }
}
