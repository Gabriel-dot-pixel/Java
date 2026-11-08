package listaheranca;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(double limite, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(double valor) {
        double saldo = super.getSaldo();
        
        if (valor <= saldo && saldo > 0) {
            super.sacar(valor);
            return true;
        } else {
            if (valor <= saldo + limite) {
                super.sacar(valor);
                return true;
            }
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta Especial: " + "\n"
               + super.toString() + "\n"
               + "Limite: " + this.limite;
    }
}
