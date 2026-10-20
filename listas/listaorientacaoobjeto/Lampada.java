package listaorientacaoobjeto;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    
    void ligar() {
        System.out.println("A lampada esta ligada.");
    }
    
    void desligar() {
        System.out.println("A lampada esta desligada.");
    }
}
