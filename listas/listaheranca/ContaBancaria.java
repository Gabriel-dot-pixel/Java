package listaheranca;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public boolean sacar(double valor) {
        if (valor <= saldo && saldo > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + this.nomeCliente + "\n"
               + "Numero da Conta: " + this.numConta + "\n"
               + "Saldo: R$" + this.saldo;
    }
}
