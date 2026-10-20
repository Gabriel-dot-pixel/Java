package aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia() {
        System.out.println("A autonomia do carro e: " + (capCombustivel*consumoCombustivel) + "km/l");
    }
    
    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia() foi chamado.");
        
        return capCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km) {
        double qtdeCombustivel = km / consumoCombustivel;
        
        return qtdeCombustivel;
    }
}
