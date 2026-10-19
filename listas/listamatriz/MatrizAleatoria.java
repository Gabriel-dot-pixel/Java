package listamatriz;

import java.util.Random;

public class MatrizAleatoria {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        int[][] matriz = new int[4][4];
        
        System.out.println("Matriz aleatoria");
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        int maior = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        
        System.out.println("O maior numero da matriz e " + maior);
        System.out.println("Ele esta na linha " + linhaMaior + " coluna " + colunaMaior);
    }
}
