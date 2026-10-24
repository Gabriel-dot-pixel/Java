package listamatriz;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[][] tabuleiro = new String[3][3];

        System.out.println("====== Jogo da Velha ======");

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (j < 2) {
                    System.out.print(tabuleiro[i][j] + " | ");
                } else {
                    System.out.print(tabuleiro[i][j]);
                }
            }
            if (i < 2) {
                System.out.println("\n---------");
            } else {
                System.out.println("\n");
            }
        }

        System.out.println("Jogador 1 vai jogar com X");
        System.out.println("Jogador 2 vai jogar com O");

        boolean jogadaValida;
        int linha;
        int coluna;
        int rodada = 0;
        String sinal = "X";
        boolean ganhou = false;
        while (!ganhou) {
            System.out.println("Rodada " + (rodada+1));
            
            if (rodada % 2 == 0) {
                System.out.println("Vez do jogador 1");
            } else {
                System.out.println("Vez do jogador 2");
            }

            jogadaValida = false;
            do {
                do {
                    System.out.print("Digite a linha (entre 1 e 3): ");
                    linha = ler.nextInt();

                    if (linha < 1 || linha > 3) {
                        System.out.println("Valor invalido");
                    }
                } while (linha < 1 || linha > 3);

                do {
                    System.out.print("Digite a coluna (entre 1 e 3): ");
                    coluna = ler.nextInt();

                    if (coluna < 1 || coluna > 3) {
                        System.out.println("Valor invalido");
                    }
                } while (coluna < 1 || coluna > 3);

                if (tabuleiro[linha - 1][coluna - 1].equals(" ")) {
                    tabuleiro[linha - 1][coluna - 1] = sinal;
                    

                    for (int i = 0; i < tabuleiro.length; i++) {
                        for (int j = 0; j < tabuleiro[i].length; j++) {
                            if (j < 2) {
                                System.out.print(tabuleiro[i][j] + " | ");
                            } else {
                                System.out.print(tabuleiro[i][j]);
                            }
                        }
                        if (i < 2) {
                            System.out.println("\n---------");
                        } else {
                            System.out.println("\n");
                        }
                    }

                    for (int i = 0; i < tabuleiro.length; i++) {
                        if (!tabuleiro[i][0].equals(" ") && tabuleiro[i][0].equals(tabuleiro[i][1])
                                && tabuleiro[i][1].equals(tabuleiro[i][2])) {
                            System.out.println("Vitoria por linha!");
                            if (rodada % 2 == 0) {
                                System.out.println("Vitoria do jogador 1");
                            } else {
                                System.out.println("Vitoria do jogador 2");
                            }
                            ganhou = true;
                        }
                    }

                    for (int i = 0; i < tabuleiro[0].length; i++) {
                        if (!tabuleiro[0][i].equals(" ") && tabuleiro[0][i].equals(tabuleiro[1][i])
                                && tabuleiro[1][i].equals(tabuleiro[2][i])) {
                            System.out.println("Vitoria por coluna!");
                            if (rodada % 2 == 0) {
                                System.out.println("Vitoria do jogador 1");
                            } else {
                                System.out.println("Vitoria do jogador 2");
                            }
                            ganhou = true;
                        }
                    }

                    if (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[1][1])
                            && tabuleiro[1][1].equals(tabuleiro[2][2])) {
                        System.out.println("Vitoria por diagonal!");
                        if (rodada % 2 == 0) {
                            System.out.println("Vitoria do jogador 1");
                        } else {
                            System.out.println("Vitoria do jogador 2");
                        }
                        ganhou = true;
                    }

                    if (!tabuleiro[0][2].equals(" ") && tabuleiro[0][2].equals(tabuleiro[1][1])
                            && tabuleiro[1][1].equals(tabuleiro[2][0])) {
                        System.out.println("Vitoria por diagonal!");
                        if (rodada % 2 == 0) {
                            System.out.println("Vitoria do jogador 1");
                        } else {
                            System.out.println("Vitoria do jogador 2");
                        }
                        ganhou = true;
                    }

                    if (!ganhou && rodada == 9) {
                        System.out.println("Empate!");
                        ganhou = true;
                    }

                    if (sinal.equals("X")) {
                        sinal = "O";
                        rodada++;
                    } else {
                        sinal = "X";
                        rodada++;
                    }
                    jogadaValida = true;
                } else {
                    System.out.println("A posicao ja esta sendo usada");
                }
            } while (!jogadaValida);
        }
    }
}
