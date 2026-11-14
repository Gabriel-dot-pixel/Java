package aula52;

public class DivisaoNaoExata extends Exception {

    private int num;
    private int den;

    public DivisaoNaoExata(int num, int den) {
        super();
        this.num = num;
        this.den = den;
    }

    @Override
    public String toString() {
        return "Resultado de " + this.num + "/" + this.den + " nao e um inteiro!";
    }
}
