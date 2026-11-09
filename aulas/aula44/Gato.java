package aula44;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raca;

    public Gato() {
    }

    public Gato(String raca) {
        this.raca = raca;
    }

    @Override
    public String amamentar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }
    
    @Override
    public void levarVeterinario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void brincar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void levarPassear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
