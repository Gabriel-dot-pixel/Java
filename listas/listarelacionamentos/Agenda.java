package listarelacionamentos;

public class Agenda {
    
    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

    public String exibirInfo() {
        String info = "Nome da Agenda: " + this.nome + "\n";
        if (contatos != null) {
            for (Contato c: contatos) {
                info += c.toString() + "\n";
            }
        }
        return info;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
}
