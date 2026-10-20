package listaorientacaoobjeto;

public class ContaCorrente {

    String numero;
    String agencia;
    double saldo;
    boolean especial;
    double limiteEspecial;
    
    boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            if (especial) {
                if (valor <= limiteEspecial + saldo) {
                    saldo -= valor;
                    return true;
                }
                return false;
            }
            return false;
        }
    }
    
    void depositar(double valor) {
        saldo += valor;
    }
    
    double consultarSaldo() {
        return saldo;
    }
    
    boolean verificarCheque() {
        return especial;
    }
}
