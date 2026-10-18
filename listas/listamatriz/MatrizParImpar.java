package listamatriz;

import java.util.Scanner;

public class MatrizParImpar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        int contPar = 0;
        int contImpar = 0;
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print("Digite o elemento na matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
                
                if (matriz[i][j] % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
        }
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Quantidade de pares digitados na matriz: " + contPar);
        System.out.println("Quantidade de impares digitados na matriz: " + contImpar);
    }
}
