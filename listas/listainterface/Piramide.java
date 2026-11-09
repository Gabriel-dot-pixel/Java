package listainterface;

public class Piramide extends Figura3D {
    
    private double arestaBase;
    private double altura;
    private double apotema;
    private Figura2D base;
    private int numPoliBase;

    public Piramide() {
    }

    public Piramide(double arestaBase, double altura, double apotema, Figura2D base, int numPoliBase) {
        this.arestaBase = arestaBase;
        this.altura = altura;
        this.apotema = altura;
        this.base = base;
        this.numPoliBase = numPoliBase;
    }

    @Override
    public double calcularArea() {
        if (base != null) {
            return base.calcularArea() + (numPoliBase * ((arestaBase * apotema) / 2));
        }
        
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            return (base.calcularArea() * altura) / 3;
        }
         
        return 0;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    
    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }
    
    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               + "Aresta da Base: " + this.arestaBase + "\n"
               + "Altura: " + this.altura + "\n"
               + "Apotema: " + this.apotema + "\n"
               + "Base: " + this.base + "\n"
               + "Numero de poligonos da Base: " + this.numPoliBase;
    }
    
}
