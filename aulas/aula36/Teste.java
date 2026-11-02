package aula36;

public class Teste {

    public static void main(String[] args) {
        
        Contato contato = new Contato();
        contato.setNome("Jack Sparrow");
        //contato.setEndereco("Caribe");
        //contato.setTelefone("19 99999-9999");
        
        //relacionamento um pra um endereço
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Mar do Caribe");
        endereco.setNumero("8");
        endereco.setComplemento("Bau de Davy Jones");
        endereco.setCidade("Curacao");
        endereco.setEstado("7 mares");
        endereco.setCep("13777-98");
        
        
        contato.setEndereco(endereco);
        
        //relacionamento um pra muitos telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Gaivota");
        telefone.setDdd("19");
        telefone.setNumero("99999-9999");
        
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Carta na garrafa");
        telefone2.setDdd("11");
        telefone2.setNumero("88888-8888");
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;
        
        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);
        
        //saida no console
        System.out.println(contato.getNome());
        
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }
        
//        if (contato != null && contato.getTelefone() != null) {
//            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
//        }
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone tel: contato.getTelefones()) {
                System.out.println(tel.getDdd() + " " + tel.getNumero());
            }
        }
    }
}
