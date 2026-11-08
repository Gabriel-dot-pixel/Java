package listaheranca;

public class TesteAnimal {

    public static void main(String[] args) {
        
        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2);
        Peixe tubarao = new Peixe("Barbatanas e cauda", "Tubarao", 300, 0, "Cinzento", "Mar", 1.5);
        Mamifero urso = new Mamifero("Mel", "Urso-do-Canada", 180, 4, "Vermelho", "Terra", 0.5);
        
        System.out.println("-------------------");
        System.out.println(camelo.toString());
        System.out.println("-------------------");
        System.out.println(tubarao.toString());
        System.out.println("-------------------");
        System.out.println(urso.toString());
        System.out.println("-------------------");
    }
}
