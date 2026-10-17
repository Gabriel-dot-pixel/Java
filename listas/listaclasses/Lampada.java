package listaclasses;

public class Lampada {

    private int id;
    private double potencia;
    private boolean estado;
    private double intensidadeLuminosa;

    public Lampada() {
    }

    public Lampada(int id, double potencia) {
        this.id = id;
        this.potencia = potencia;
        this.estado = false;
        this.intensidadeLuminosa = 0;
    }
    
    public boolean ligar() {
        if (estado) {
            return false;
        }
        
        estado = true;
        intensidadeLuminosa = 100;
        
        return true;
    }
    
    public boolean desligar() {
        if (!estado) {
            return false;
        }
        
        estado = false;
        intensidadeLuminosa = 0;
        
        return true;
    }
    
    boolean ajustarIntensidade(double intensidade) {
        if (estado) {
            intensidadeLuminosa = intensidade;
            return true;
        }
        
        return false;
    }
    
    void mostrarInfo() {
        System.out.println("Indentificador: " + id);
        System.out.println("Potencia: " + potencia);
        System.out.println("Estado (true - ligada | false - desligada): " + estado);
        System.out.println("Intensidade luminosa: " + intensidadeLuminosa);
    }
    
    double calcularConsumo(int horas) {
        double consumo = (potencia*(intensidadeLuminosa/100)*horas)/1000;
        return consumo;
    }

    public double getIntensidadeLuminosa() {
        return intensidadeLuminosa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean isEstado() {
        return estado;
    }

}
