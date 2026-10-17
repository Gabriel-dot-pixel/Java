package aula29;

public class TesteCarro {

    public static void main(String[] args) {
        
        Carro van = new Carro();
        Carro van2 = new Carro("Fiat");
        Carro van3 = new Carro("Fiat", "Ducato", 10, 100, 0.2);
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.numPassageiros);
        
        van2.modelo = "Ducato";
        System.out.println(van2.marca);
        
        System.out.println(van3.marca);
        System.out.println(van3.modelo);
        System.out.println(van3.numPassageiros);
        System.out.println(van3.capCombustivel);
        System.out.println(van3.consumoCombustivel);
    }
}
