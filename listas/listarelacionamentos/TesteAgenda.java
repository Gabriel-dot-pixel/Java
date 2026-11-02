package listarelacionamentos;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];
        
        System.out.print("Digite o nome da agenda: ");
        String nome = ler.nextLine();
        agenda.setNome(nome);
        
        for (int i=0; i<contatos.length; i++) {
            Contato c = new Contato();
            
            System.out.print("Digite o nome do contato " + (i+1) + ": ");
            String nomeContato = ler.nextLine();
            c.setNome(nomeContato);
            
            System.out.print("Digite o e-mail do contato " + (i+1) + ": ");
            String email = ler.nextLine();
            c.setEmail(email);
            
            System.out.print("Digite o telefone do contato " + (i+1) + ": ");
            String telefone = ler.nextLine();
            c.setTelefone(telefone);
            
            contatos[i] = c;
        }
        
        agenda.setContatos(contatos);
        
        if (agenda != null) {
            System.out.println(agenda.exibirInfo());
        }
    }
}
