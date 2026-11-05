package listaestruturarepeticao;

import java.util.Scanner;

public class TabelaPao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Preço do pão: ");
        double preco = ler.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i=1; i<=50; i++) {
            System.out.println(i + " - R$" + preco);
            preco += preco;
        }

        ler.close();
    }
}
