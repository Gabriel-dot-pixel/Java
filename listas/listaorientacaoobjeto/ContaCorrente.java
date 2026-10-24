package listaorientacaoobjeto;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, double saldo, boolean especial, double limiteEspecial, double valorEspecialUsado) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
    }
    
    public boolean sacar(double valor) {
        if (valor <= saldo && saldo > 0) {
            debitarValor(valor);
            return true;
        } else {
            if (especial) {
                if (valor <= limiteEspecial + saldo && valorEspecialUsado < limiteEspecial) {
                    debitarValor(valor);
                    aumentarUsoEspecial(valor);
                    return true;
                }
                return false;
            }
            return false;
        }
    }
    
    private void debitarValor(double valor) {
        saldo -= valor;
    }
    
    private void aumentarUsoEspecial(double valor) {
        valorEspecialUsado += valor;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public boolean verificarCheque() {
        return saldo < 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }
}
