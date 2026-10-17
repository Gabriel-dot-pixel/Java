package listaclasses;

public class ContaCorrente {

    private int numero;
    private String titular;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;

    public ContaCorrente() {
    }

    public ContaCorrente(int numero, String titular, double saldo, boolean especial, double limiteEspecial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
    }

    boolean sacar(double valor) {
        if (valor <= saldo && valor >= 0) {
            saldo -= valor;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if (limite >= valor) {
                    saldo -= valor;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    boolean depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    double consultarSaldo() {
        return saldo;
    }
    
    boolean transferir(ContaCorrente destino, double valor) {
        if (valor >= 0 && destino != null) {
            if (this.sacar(valor)) {
                destino.depositar(valor);
                return true;
            }
            return false;
        }
        return false;
    }
    
    public double consultarLimiteUtilizado() {
        if (especial) {
            return limiteEspecial - saldo;
        }
        
        return 0;
    }
    
    public double consultarLimiteDisponivel() {
        if (especial) {
            return limiteEspecial;
        }
        
        return 0;
    }
    
    public void mostrarInfo() {
        System.out.println("Numero: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Uso de cheque especial: " + especial);
        System.out.println("Limite de cheque especial: " + limiteEspecial);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
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
}
