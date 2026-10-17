package aula21;

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        int[] notas = new int[10];
        
        for (int i=0; i<notas.length; i++) {
            notas[i] = aleatorio.nextInt(10);
        }
        
        for (int nota : notas) {
            System.out.println(nota);
        }
        
        //for-each funciona assim internamente
//        for (int i=0; i<notas.length; i++) {
//            int nota = notas[i];
//            System.out.println(nota);
//        }
    }
}
