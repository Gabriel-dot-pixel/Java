package listaestruturarepeticao;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int numAlunoAlto = 0;
        int numAlunoBaixo = 0;
        double maisAlto = 0;
        double maisBaixo = 0;
        
        for (int i=1; i<=10; i++) {
            System.out.print("Digite o numero do " + i + "º aluno: ");
            int num = ler.nextInt();
            
            System.out.print("Digite a altura do " + i + "º aluno (em metros): ");
            double altura = ler.nextDouble();
            
            if (i == 1) {
                numAlunoAlto = num;
                numAlunoBaixo = num;
                maisAlto = altura;
                maisBaixo = altura;
            }
            
            if (altura > maisAlto) {
                numAlunoAlto = num;
                maisAlto = altura;
            } else if (altura < maisBaixo) {
                numAlunoBaixo = num;
                maisBaixo = altura;
            }
        }
        
        System.out.println("--------------------------");
        System.out.println("Aluno mais alto:");
        System.out.println("Numero: " + numAlunoAlto);
        System.out.println("Altura: " + maisAlto + "m");
        System.out.println("--------------------------");
        System.out.println("Aluno mais baixo:");
        System.out.println("Numero: " + numAlunoBaixo);
        System.out.println("Altura: " + maisBaixo + "m");
    }
}
