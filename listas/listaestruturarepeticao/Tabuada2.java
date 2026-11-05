package listaestruturarepeticao;

import java.util.Scanner;

public class Tabuada2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int num = ler.nextInt();
        
        System.out.print("Comecar por: ");
        int comeco = ler.nextInt();
        
        System.out.println("Termina em: ");
        int fim = ler.nextInt();
        
        while (fim < comeco) {
            System.out.println("O fim da tabuada nao pode ser menor que o comeco!");
            System.out.println("Digite novamente: ");
            fim = ler.nextInt();
        }

        System.out.println("Vou montar a tabuada de " + num + " comecando em " + comeco + " e terminando em " + fim + ":");
        for (int i=comeco; i<=fim; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
