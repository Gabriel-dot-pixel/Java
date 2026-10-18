package aula20;

import java.util.Scanner;

public class MatrizIrregular {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite quantas pessoas serao entrevistadas: ");
        int qtdeEntrvistados = ler.nextInt();
        
        String[][] nomesFilhos = new String[qtdeEntrvistados][];
        
        for (int i=0; i<nomesFilhos.length; i++) {
            System.out.print("Digite a quantidade de filhos: ");
            int qtdeFilhos = ler.nextInt();
            ler.nextLine();
            
            nomesFilhos[i] = new String[qtdeFilhos];
            for (int j=0; j<nomesFilhos[i].length; j++) {
                System.out.print("Digite o nome do filho " + (j+1) + ": ");
                nomesFilhos[i][j] = ler.nextLine();
            }
        }
        
        for (int i=0; i<nomesFilhos.length; i++) {
            System.out.println("Entrevistado " + (i+1) + " tem " + nomesFilhos[i].length + " filho(s)");
            for (int j=0; j<nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
