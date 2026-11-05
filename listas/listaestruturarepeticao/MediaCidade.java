package listaestruturarepeticao;

import java.util.Scanner;

public class MediaCidade {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int codMaisAcidente = 0;
        int codMenosAcidente = 0;
        int menosAcidente = 0;
        int maisAcidente = 0;
        int somaVeiculo = 0;
        int quantCidadePequena = 0;
        int somaCidadePequena = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o codigo da cidade: ");
            int codigo = ler.nextInt();

            System.out.print("Digite o numero de veiculos de passeio: ");
            int quantVeiculo = ler.nextInt();
            
            somaVeiculo += quantVeiculo;

            System.out.print("Digite o numero de acidentes de transito com vitimas: ");
            int quantAcidente = ler.nextInt();
            
            if (quantVeiculo <= 2000) {
                quantCidadePequena++;
                somaCidadePequena += quantAcidente;
            }

            if (i == 1) {
                codMaisAcidente = codigo;
                codMenosAcidente = codigo;
                menosAcidente = quantAcidente;
                maisAcidente = quantAcidente;
            }

            if (quantAcidente > maisAcidente) {
                codMaisAcidente = codigo;
                maisAcidente = quantAcidente;
            } else if (quantAcidente < menosAcidente) {
                codMenosAcidente = codigo;
                menosAcidente = quantAcidente;
            }
        }
        
        double mediaVeiculo = somaVeiculo/5;
        double mediaAcidenteCidadePequena = somaCidadePequena/quantCidadePequena;
        
        System.out.println("---------------------------------");
        System.out.println("Cidade com mais acidente:");
        System.out.println("Codigo: " + codMaisAcidente);
        System.out.println("Indice de acidentes: " + maisAcidente);
        System.out.println("---------------------------------");
        System.out.println("Cidade com menos acidente:");
        System.out.println("Codigo: " + codMenosAcidente);
        System.out.println("Indice: " + menosAcidente);
        System.out.println("---------------------------------");
        System.out.println("Media de veiculos em todas as cidades: " + mediaVeiculo);
        System.out.println("Media de acidentes nas cidades com menos de 2.000 veiculos de passeio: " + mediaAcidenteCidadePequena);
    }
}
