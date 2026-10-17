package listaclasses;

import java.util.Scanner;

public class PrincipalContaCorrente {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ContaCorrente c1 = new ContaCorrente(1234, "Gabriel", 1000, false, 0);
        ContaCorrente c2 = new ContaCorrente(5678, "Pedro", -500, true, 700);
        ContaCorrente c3 = new ContaCorrente(2468, "Maria", 600, false, 0);
        
        System.out.println("Saldo atual da conta do Gabriel: R$" + c1.consultarSaldo());
        System.out.println("Saque de R$300,00 da conta do Gabriel");
        boolean saque = c1.sacar(300);
        
        if (saque) {
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual na conta do Gabriel: R$" + c1.consultarSaldo());
        }
        
        System.out.println("Saldo atual na conta do Pedro: R$" + c2.consultarSaldo());
        System.out.println("Tentativa de saque de R$800,00 da conta do Pedro");
        boolean tentativa = c1.sacar(800);
        
        if (!tentativa) {
            System.out.println("Saque negado");
            System.out.println("Valor solicitado ultrapassou o limite especial disponivel");
        }
        
        System.out.println("Deposito de R$650,00 na conta do Pedro");
        boolean deposito = c2.depositar(650);
        
        if (deposito) {
            System.out.println("Deposito efetuado com sucesso");
            System.out.println("Saldo atual na conta do Pedro: R$" + c2.consultarSaldo());
        }
        
        System.out.println("Saldo atual na conta da Maria: R$" + c3.consultarSaldo());
        System.out.println("Transferencia de R$700 da conta do Gabriel para a conta da Maria");
        boolean transferencia = c1.transferir(c3, 700);
        
        if (transferencia) {
            System.out.println("Transferencia concluida com sucesso");
            System.out.println("Saldo atual na conta do Gabriel: R$" + c1.consultarSaldo());
            System.out.println("Saldo atual na conta da Maria: R$" + c3.consultarSaldo());
        }
    }
}
