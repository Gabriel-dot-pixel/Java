package listaestruturarepeticao;

import java.util.Scanner;

public class CalculoSalario2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double percentual = 0.015;
        double salarioFinal = 0;
        
        System.out.print("Digite o salario inicial do funcionario: R$");
        double salarioInicial = ler.nextDouble();
        
        for (int i=0; i<29; i++) {
            percentual *= 2;
            salarioFinal = salarioInicial + (salarioInicial * percentual);
        }
        
        System.out.println("O salario do funcionario em 1996 era: R$" + salarioInicial);
        System.out.println("O salario atual desse mesmo funcionario e: R$" + salarioFinal);
    }
}
