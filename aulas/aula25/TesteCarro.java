package aula25;

import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Carro van = new Carro();
        
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        van.exibirAutonomia();
        
        System.out.print("Digite quantos km o carro vai rodar: ");
        double km = ler.nextDouble();
        
        double combustivel = van.calcularCombustivel(km);
        
        System.out.println("Voce vai precisar de " + combustivel + "l de combustivel para rodar essa distancia");
    }
}
