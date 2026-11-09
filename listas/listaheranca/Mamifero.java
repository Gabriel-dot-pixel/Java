package listaheranca;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super.setAmbiente("Terra");
    }

    public Mamifero(String alimento, String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               + "Alimento: " + this.alimento;
    }
}
