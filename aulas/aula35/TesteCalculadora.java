package aula35;

public class TesteCalculadora {
    
    public static void main(String[] args) {
        
        System.out.println("Usando fatorial nao recursivo");
        System.out.println(Calculadora.fatorialNaoRecursivo(5));
        
        System.out.println("Usando fatorial recursivo");
        System.out.println(Calculadora.fatorialRecursivo(5));
    }
}
