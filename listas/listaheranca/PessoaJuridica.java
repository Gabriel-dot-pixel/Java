package listaheranca;

public class PessoaJuridica extends Contribuinte {
    
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }
    
    @Override
    public double calcularImposto() {
        return super.getRendaBruta() * 0.1;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               + "CNPJ: " + this.cnpj + "\n"
               + "Imposto a ser pago: R$ " + this.calcularImposto();
    }
}
