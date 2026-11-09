package aula44;

public class Papagaio extends Ave {

    @Override
    public String voar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String emitirSom() {
        return "Crrác crrác!";
    }
    
}
