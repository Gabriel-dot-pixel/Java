package listaorientacaoobjeto;

public class TesteLampada {

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada("A60", "Bivolt", 36, "Amarela", "Amarela", 7, true, true);
        
        lampada.getTipos()[0] = "Abajur";
        lampada.getTipos()[1] = "Lampeoes";
        
        lampada.mudarEstado();
        
        lampada.exibirEstado();
        
        lampada.mudarEstado();
        
        lampada.exibirEstado();
        
        lampada.mudarEstado();
        
        lampada.exibirEstado();
    }
}
