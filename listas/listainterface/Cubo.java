package listainterface;

public class Cubo extends Figura3D {
    
    private double aresta;

    public Cubo() {
    }

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        double area = 6 * Math.pow(aresta, 2);
        
        return area;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               + "Aresta: " + this.aresta;
    }
    
}
