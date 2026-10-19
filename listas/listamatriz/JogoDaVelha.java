package listamatriz;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[][] tabuleiro = new String[3][3];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("\n---------");
        }

        boolean jogadaValida;
        int linha;
        int coluna;
        int posicoesOcupadas = 0;
        String jogadorAtual = "X";
        boolean valido = false;
        while (!valido) {
            System.out.println("Vez do jogador " + jogadorAtual);

            jogadaValida = false;
            do {
                do {
                    System.out.print("Digite a linha (entre 0 e 2): ");
                    linha = ler.nextInt();

                    if (linha < 0 || linha > 2) {
                        System.out.println("Valor invalido");
                    }
                } while (linha < 0 || linha > 2);

                do {
                    System.out.print("Digite a coluna (entre 0 e 2): ");
                    coluna = ler.nextInt();

                    if (coluna < 0 || coluna > 2) {
                        System.out.println("Valor invalido");
                    }
                } while (coluna < 0 || coluna > 2);

                if (tabuleiro[linha][coluna].equals(" ")) {
                    tabuleiro[linha][coluna] = jogadorAtual;
                    posicoesOcupadas++;

                    for (int i = 0; i < tabuleiro.length; i++) {
                        for (int j = 0; j < tabuleiro[i].length; j++) {
                            System.out.print(tabuleiro[i][j] + " | ");
                        }
                        System.out.println("\n---------");
                    }

                    for (int i = 0; i < tabuleiro.length; i++) {
                        if (!tabuleiro[i][0].equals(" ") && tabuleiro[i][0].equals(tabuleiro[i][1])
                                && tabuleiro[i][1].equals(tabuleiro[i][2])) {
                            System.out.println("Vitoria por linha!");
                            System.out.println("Vitoria do jogador " + jogadorAtual);
                            valido = true;
                        }
                    }

                    for (int i = 0; i < tabuleiro[0].length; i++) {
                        if (!tabuleiro[0][i].equals(" ") && tabuleiro[0][i].equals(tabuleiro[1][i])
                                && tabuleiro[1][i].equals(tabuleiro[2][i])) {
                            System.out.println("Vitoria por coluna!");
                            System.out.println("Vitoria do jogador " + jogadorAtual);
                            valido = true;
                        }
                    }

                    if (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[1][1])
                            && tabuleiro[1][1].equals(tabuleiro[2][2])) {
                        System.out.println("Vitoria por diagonal!");
                        System.out.println("Vitoria do jogador " + jogadorAtual);
                        valido = true;
                    }

                    if (!tabuleiro[0][2].equals(" ") && tabuleiro[0][2].equals(tabuleiro[1][1])
                            && tabuleiro[1][1].equals(tabuleiro[2][0])) {
                        System.out.println("Vitoria por diagonal!");
                        System.out.println("Vitoria do jogador " + jogadorAtual);
                        valido = true;
                    }

                    if (!valido && posicoesOcupadas == 9) {
                        System.out.println("Empate!");
                        valido = true;
                    }

                    if (!valido && jogadorAtual.equals("X")) {
                        jogadorAtual = "O";
                    } else {
                        jogadorAtual = "X";
                    }
                    jogadaValida = true;
                } else {
                    System.out.println("A posicao ja esta sendo usada");
                }
            } while (!jogadaValida);
        }
    }
}
