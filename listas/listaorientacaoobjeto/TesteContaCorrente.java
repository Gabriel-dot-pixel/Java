package listaorientacaoobjeto;

public class TesteContaCorrente {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente("123456", "1234", 500, true, 0, -10);
        
        System.out.println("Saldo da conta " + conta.getNumero() + ": R$" + conta.getSaldo());
        
        System.out.println("Saque de R$100,00");
        boolean saque = conta.sacar(100);
        
        if (saque) {
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual da conta: R$" + conta.getSaldo());
        } 
        
        System.out.println("Tentativa de saque de R$500,00");
        saque = conta.sacar(500);
        
        if (!saque) {
            System.out.println("O saque nao pode ser efetuado");
        }
        
        System.out.println("Deposito de R$500,00");
        conta.depositar(500);
        
        conta.consultarSaldo();
        
        if (conta.verificarCheque()) {
            System.out.println("Conta " + conta.getNumero() + " esta usando cheque especial");
        } else {
            System.out.println("Conta " + conta.getNumero() + " nao esta usando cheque especial");
        }
    }
}
