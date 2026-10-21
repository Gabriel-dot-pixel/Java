package listaorientacaoobjeto;

public class ContaCorrente {

    String numero;
    String agencia;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    
    boolean sacar(double valor) {
        if (valor <= saldo && saldo > 0) {
            saldo -= valor;
            return true;
        } else {
            if (especial) {
                if (valor <= limiteEspecial + saldo && valorEspecialUsado < limiteEspecial) {
                    saldo -= valor;
                    valorEspecialUsado += valor;
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
        return saldo < 0;
    }
}
