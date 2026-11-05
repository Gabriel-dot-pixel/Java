package listaestruturarepeticao;

import java.util.Scanner;

public class CaixaRegistradora {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valor;
        String proximo;
        double pagamento = 0;

        do {
            int quantItem = 0;
            double somaValor = 0;

            System.out.println("Lojas Tabajara");

            do {
                quantItem++;
                System.out.print("Produto " + quantItem + ": ");
                valor = ler.nextDouble();

                somaValor += valor;
            } while (valor != 0);

            System.out.println("Total: R$" + somaValor);

            do {
                System.out.print("Dinheiro: R$");
                pagamento += ler.nextDouble();
                
                if (pagamento < somaValor) {
                    System.out.println("Ainda faltam R$" + (somaValor-pagamento) + " para pagar a compra");
                }
            } while (pagamento < somaValor);

            double troco = pagamento - somaValor;
            System.out.println("Troco: R$" + troco);

            System.out.println("Registrar proxima compra (S/N)?");
            proximo = ler.next();
        } while (proximo.equalsIgnoreCase("S"));
    }
}
