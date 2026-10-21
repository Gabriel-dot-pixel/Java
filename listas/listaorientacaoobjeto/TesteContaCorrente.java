package listaorientacaoobjeto;

public class TesteContaCorrente {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;
        
        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
        
        System.out.println("Saque de R$100,00");
        boolean saque = conta.sacar(100);
        
        if (saque) {
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual da conta: R$" + conta.saldo);
        } else {
            System.out.println("O saque nao pode ser efetuado");
        }
        
        System.out.println("Tentativa de saque de R$500,00");
        saque = conta.sacar(500);
        
        if (saque) {
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual da conta " + conta.numero + ": R$" + conta.saldo);
        } else {
            System.out.println("O saque nao pode ser efetuado");
        }
        
        System.out.println("Deposito de R$500,00");
        conta.depositar(500);
        System.out.println("Saldo atual da conta " + conta.numero + ": R$" + conta.saldo);
        
        double saldoAtual = conta.consultarSaldo();
        System.out.println("Saldo atual da conta " + conta.numero + ": R$" + saldoAtual);
        
        System.out.println("Conta " + conta.numero + " esta usando cheque especial: " + conta.verificarCheque());
    }
}
