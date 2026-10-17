package aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    Carro() {
        System.out.println("A classe carro foi instanciada");
        numPassageiros = 4;
    }
    
    Carro(String marca_) {
        marca = marca_;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }
    
    
    
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
