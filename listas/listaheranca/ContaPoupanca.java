package listaheranca;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int diaRendimento, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public void calcularNovoSalario(double taxaRendimento) {
        double saldo = super.getSaldo();
        
        saldo = saldo * Math.pow(1+taxaRendimento, diaRendimento);
        
        super.setSaldo(saldo);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "Conta Poupanca: " + "\n"
               + super.toString() + "\n"
               + "Dias de Rendimento: " + this.diaRendimento;
    }
}
