package listaestruturarepeticao;

import java.util.Scanner;

public class MediaAcademia {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int codigo;
        int quant = 0;
        int codAlto = 0;
        int codBaixo = 0;
        int codGordo = 0;
        int codMagro = 0;
        double maisAlto = 0;
        double maisBaixo = 0;
        double maisGordo = 0;
        double maisMagro = 0;
        double somaAltura = 0;
        double somaPeso = 0;
        

        do {
            System.out.print("Digite seu codigo: ");
            codigo = ler.nextInt();

            if (codigo != 0) {
                quant++;
                System.out.print("Digite sua altura (em metros): ");
                double altura = ler.nextDouble();
                
                somaAltura += altura;
                
                System.out.print("Digite seu peso (em kg): ");
                double peso = ler.nextDouble();
                
                somaPeso += peso;
                
                if (quant == 1) {
                    codAlto = codigo;
                    codBaixo = codigo;
                    codGordo = codigo;
                    codMagro = codigo;
                    maisAlto = altura;
                    maisBaixo = altura;
                    maisGordo = peso;
                    maisMagro = peso;
                }
                
                if (altura > maisAlto) {
                    maisAlto = altura;
                    codAlto = codigo;
                } else if (altura < maisBaixo) {
                    maisBaixo = altura;
                    codBaixo = codigo;
                }
                
                if (peso > maisGordo) {
                    maisGordo = peso;
                    codGordo = codigo;
                } else if (peso < maisMagro) {
                    maisMagro = peso;
                    codMagro = codigo;
                }
            }
        } while (codigo != 0);
        
        System.out.println("--------------------------");
        System.out.println("Cliente mais alto:");
        System.out.println("Codigo: " + codAlto);
        System.out.println("Altura: " + maisAlto + "m");
        
        System.out.println("--------------------------");
        
        System.out.println("Cliente mais baixo:");
        System.out.println("Codigo: " + codBaixo);
        System.out.println("Altura: " + maisBaixo + "m");
        
        System.out.println("--------------------------");
        
        System.out.println("Cliente mais gordo:");
        System.out.println("Codigo: " + codGordo);
        System.out.println("Peso: " + maisGordo + "kg");
        
        System.out.println("--------------------------");
        
        System.out.println("Cliente mais magro:");
        System.out.println("Codigo: " + codMagro);
        System.out.println("Peso: " + maisMagro + "kg");
        
        double mediaAltura = somaAltura/quant;
        double mediaPeso = somaPeso/quant;
        
        System.out.println("Media de altura dos clientes: " + mediaAltura + "m");
        System.out.println("Media de peso dos clientes: " + mediaPeso + "kg");
    }
}
