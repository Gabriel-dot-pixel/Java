package listamatriz;

import java.util.Random;

public class MatrizAleatoria2 {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        int[][] matriz = new int[10][10];
        
        System.out.println("Matriz aleatoria");
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        int maiorLinha5 = matriz[5][0];
        int menorLinha5 = matriz[5][0];
        
        for (int j=0; j<matriz[5].length; j++) {
            if (matriz[5][j] > maiorLinha5) {
                maiorLinha5 = matriz[5][j];
            } else if (matriz[5][j] < menorLinha5) {
                menorLinha5 = matriz[5][j];
            }
        }
        
        System.out.println("O maior numero da linha 5 e " + maiorLinha5 + " e o menor numero e " + menorLinha5);
        
        int maiorColuna7 = matriz[0][7];
        int menorColuna7 = matriz[0][7];
        
        for (int i=0; i<matriz.length; i++) {
            if (matriz[i][7] > maiorColuna7) {
                maiorColuna7 = matriz[i][7];
            } else if (matriz[i][7] < menorColuna7) {
                menorColuna7 = matriz[i][7];
            }
        }
        
        System.out.println("O maior numero da coluna 7 e " + maiorColuna7 + " e o menor numero e " + menorColuna7);
    }
}
