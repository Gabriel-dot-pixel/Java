package aula20;

public class MatrizTridimensional {

    public static void main(String[] args) {
        
        int[][][] matrizTridmen = new int[3][3][3];
        
        for (int i=0; i<matrizTridmen.length; i++) {
            for (int j=0; j<matrizTridmen[i].length; j++) {
                for (int k=0; k<matrizTridmen[i][j].length; k++) {
                    System.out.println("i = " + i + " | j = " + j + " | k = " + k);
                    matrizTridmen[i][j][k] = i + j + k;
                }
            }
        }
        
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i=0; i<matrizTridmen.length; i++) {
            for (int j=0; j<matrizTridmen[i].length; j++) {
                for (int k=0; k<matrizTridmen[i][j].length; k++) {
                    soma += matrizTridmen[i][j][k];
                    
                    if (matrizTridmen[i][j][k] % 2 == 0) {
                        somaPares += matrizTridmen[i][j][k];
                    } else {
                        somaImpares += matrizTridmen[i][j][k];
                    }
                }
            }
        }
        
        System.out.println("Soma de todos os valores da matriz: " + soma);
        System.out.println("Soma de todos os valores pares da matriz: " + somaPares);
        System.out.println("Soma de todos os valores impares da matriz: " + somaImpares);
    }
}
