package listainterface;

public class Cilindro extends Figura3D {
    
    private double raio;
    private double altura;

    public Cilindro() {
    }

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = 2 * Math.PI * raio * (raio + altura);
        
        return area;
    }

    @Override
    public double calcularVolume() {
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        
        return volume;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               + "Raio: " + this.raio + "\n"
               + "Altura: " + this.altura;
    }
    
}
