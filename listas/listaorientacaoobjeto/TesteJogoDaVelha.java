package listaorientacaoobjeto;

import java.util.Scanner;

public class TesteJogoDaVelha {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        
        int linha;
        int coluna;
        boolean jogada;

        System.out.println("====== Jogo da Velha ======");
        
        jogo.montarTabuleiro();
        jogo.exibirTabuleiro();
        
        while (!jogo.isFinalizado()) {
            System.out.println("Rodada " + (jogo.getRodada()+1));
            
            if (jogo.getRodada() % 2 == 0) {
                System.out.println("Vez do jogador 1");
            } else {
                System.out.println("Vez do jogador 2");
            }
            
            do {
                System.out.print("Digite a linha (entre 1 e 3): ");
                linha = ler.nextInt();

                System.out.print("Digite a coluna (entre 1 e 3): ");
                coluna = ler.nextInt();

                jogada = jogo.realizarJogada(linha, coluna);

                if (jogada) {
                    jogo.exibirTabuleiro();
                    if (jogo.finalizarPartida()) {
                        if (jogo.verificarVitoria()) {
                            if (jogo.getRodada() % 2 == 0) {
                                System.out.println("Vitoria do jogador 1");
                            } else {
                                System.out.println("Vitoria do jogador 2");
                            }
                            System.out.println("Jogo Finalizado");
                        } else if (jogo.verificarEmpate()) {
                            System.out.println("Jogo Finalizado");
                        }
                    } else{
                        jogo.trocarSinal();
                    }
                } else {
                    System.out.println("Jogada invalida");
                }
            } while (!jogada);
        }
    }
}