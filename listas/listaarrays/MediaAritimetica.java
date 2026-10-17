package listaarrays;

import java.util.Scanner;

public class MediaAritimetica {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double[] Nota1 = new double[10];
        double[] Nota2 = new double[10];
        double[] Resultado = new double[10];
        
        for (int i=0; i<10; i++) {
            System.out.print("Digite a nota bimestral 1 do aluno " + (i+1) +": ");
            Nota1[i] = ler.nextDouble();
            System.out.print("Digite a nota bimestral 2 do aluno " + (i+1) +": ");
            Nota2[i] = ler.nextDouble();
        }
        
        for (int i=0; i<10; i++) {
            Resultado[i] = (double)(Nota1[i]+Nota2[i])/2;
        }
        
        for (int i=0; i<10; i++) {
            System.out.println("Media do aluno " + (i+1) + ": " + Resultado[i]);
            System.out.print("Situacao: ");
            
            if (Resultado[i] >= 7.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
