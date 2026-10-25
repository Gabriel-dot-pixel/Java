package listametodosestaticos;

public class TesteContador {
    
    static void imprimirCont() {
        System.out.println(Contador.retornar());
    }

    public static void main(String[] args) {
        
        imprimirCont();
        
        Contador.incrementar();
        
        imprimirCont();
        
        Contador.zerar();
        
        imprimirCont();
        
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        
        imprimirCont();
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        
        imprimirCont();
    }
}
