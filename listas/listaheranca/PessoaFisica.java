package listaheranca;

public class PessoaFisica extends Contribuinte {
    
    private String cpf;    

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }
    
    @Override
    public double calcularImposto() {
        double renda = super.getRendaBruta();
        
        if (renda >= 0 && renda <= 1400) {
            return 0;
        }  
            
        if (renda >= 1400.01 && renda <= 2100) {
            return (renda * 0.1) - 100;
        }  
            
        if (renda >= 2100.01 && renda <= 2800) {
            return (renda * 0.15) - 270;
        }  
            
        if (renda >= 2800.01 && renda <= 3600) {
            return (renda * 0.25) - 500;
        } 
        
        return (renda * 0.3) - 700;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               + "CPF: " + this.cpf + "\n"
               + "Imposto a ser pago: R$ " + this.calcularImposto();
    }
}
