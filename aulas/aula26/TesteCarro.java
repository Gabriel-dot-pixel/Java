package aula26;

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
        
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro e: " + autonomia);
        System.out.println("A autonomia do carro e: " + van.obterAutonomia());
    }
}
