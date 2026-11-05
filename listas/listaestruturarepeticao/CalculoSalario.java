package listaestruturarepeticao;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double percentual = 0.015;
        double salario = 1000;
        
        for (int i=0; i<29; i++) {
            percentual *= 2;
            salario = salario + (salario * percentual);
        }
        
        System.out.println("O salario do funcionario em 1996 era: R$1.000,00");
        System.out.println("O salario atual desse mesmo funcionario e: R$" + salario);
    }
}
