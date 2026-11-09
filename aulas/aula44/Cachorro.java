package aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    
    private String tamanho;
    private String raca;

    public Cachorro() {
    }

    public Cachorro(String tamanho, String raca) {
        this.tamanho = tamanho;
        this.raca = raca;
    }

    @Override
    public String amamentar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String emitirSom() {
        return "Au-Au";
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
