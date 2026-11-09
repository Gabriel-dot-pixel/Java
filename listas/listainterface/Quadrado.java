package listainterface;

public class Quadrado extends Figura2D {
    
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2); 
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               + "Lado: " + this.lado;
    }
    
}
