package listametodosestaticos;

public class TesteCalculadora {

    public static void main(String[] args) {
        
        System.out.println("Soma de 1 + 2");
        System.out.println(Calculadora.somar(1, 2));
        
        System.out.println("Subtracao de 3 - 1");
        System.out.println(Calculadora.subratair(3, 1));
        
        System.out.println("Multiplicacao de 2 * 2");
        System.out.println(Calculadora.multiplicar(2, 2));
        
        System.out.println("Divisao de 6 / 3");
        System.out.println(Calculadora.dividir(6, 3));
        
        System.out.println("Potencia de 2 ^ 4");
        System.out.println(Calculadora.elevarPotenciaN(2, 4));
        
        System.out.println("Fatorial de 5");
        System.out.println(Calculadora.fatorial(5));
    }
}
