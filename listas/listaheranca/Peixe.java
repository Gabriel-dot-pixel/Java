package listaheranca;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe() {
    }

    public Peixe(String caracteristicas, String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               + "Caracteristicas: " + this.caracteristicas;
    }
}
