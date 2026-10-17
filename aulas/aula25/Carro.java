package aula25;

public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia() {
        double autonomia = obterAutonomia();
//        System.out.println("A autonomia do carro e: " + (capCombustivel*consumoCombustivel) + "km/l");
        System.out.println("A autonomia do carro e: " + autonomia + "km/l");
    }
    
    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km) {
        double autonomia = obterAutonomia();
        return km/autonomia;
    }
}
