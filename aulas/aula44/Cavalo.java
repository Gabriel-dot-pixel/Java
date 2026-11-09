package aula44;

public class Cavalo extends Mamifero implements AnimalDomesticado {

    @Override
    public String amamentar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String emitirSom() {
        return "Iiirrrrí";
    }

    @Override
    public void levarVeterinario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
