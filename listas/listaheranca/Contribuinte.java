package listaheranca;

public abstract class Contribuinte {

    private String nome;
    private double rendaBruta;

    public Contribuinte() {
    }

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
    
    public abstract double calcularImposto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public String toString() {
        return "Contribuinte: " + this.nome + "\n"
               + "Renda Bruta: R$ " + this.rendaBruta;
    }
}
