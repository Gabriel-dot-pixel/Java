package listaorientacaoobjeto;

public class TesteContato {

    public static void main(String[] args) {
        
        Contato c1 = new Contato();
        
        c1.nome = "Joao";
        c1.endereco = "Av. Paulista, 1000";
        c1.email = "joao@email.com";
        
        c1.telefones = new String[5];
        c1.telefones[0] = "99999-9999";
        c1.telefones[1] = "99999-9998";
        c1.telefones[2] = "99999-9997";
    }
}
