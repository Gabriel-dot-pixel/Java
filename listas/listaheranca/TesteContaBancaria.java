package listaheranca;

import java.util.Scanner;

public class TesteContaBancaria {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ContaPoupanca cp = new ContaPoupanca(30, "Jose", "12345", 5000);
        ContaEspecial ce = new ContaEspecial(500, "Luisa", "67890", 1000);
        
        System.out.println("Saldo na conta poupanca: R$ " + cp.getSaldo());
        System.out.println("Saldo na conta especial: R$ " + ce.getSaldo());
        
        System.out.println("Saque de R$500 da conta poupanca");
        boolean saque = cp.sacar(500);
        
        if (saque) {
            System.out.println("Saque realizado com sucesso!");
        }
        
        System.out.println("Saldo na conta poupanca: R$ " + cp.getSaldo());
        
        System.out.println("Tentativa de saque de R$1600 da conta especial");
        saque = ce.sacar(1600);
        
        if (!saque) {
            System.out.println("Tentativa de saque negada!");
        }
        
        System.out.println("Deposito de R$1000 nas contas poupanca e especial");
        cp.depositar(1000);
        ce.depositar(1000);
        
        System.out.println("Saldo na conta poupanca: R$ " + cp.getSaldo());
        System.out.println("Saldo na conta especial: R$ " + ce.getSaldo());
        
        System.out.println("Rendimento da conta poupanca apos 30 dias");
        cp.calcularNovoSalario(0.005);
        System.out.println("Saldo na conta poupanca: R$ " + cp.getSaldo());
        
        System.out.println("Dados da conta poupanca");
        System.out.println(cp.toString());
        
        System.out.println("Dados da conta especial");
        System.out.println(ce.toString());
    }
}
