package listaorientacaoobjeto;

public class JogoDaVelha {

    String[][] tabuleiro = new String[3][3];
    String sinal;
    int rodada;
    boolean finalizado;

    void montarTabuleiro() {
        sinal = "X";
        rodada = 0;
        finalizado = false;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }
    }

    void exibirTabuleiro() {
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
    }

    boolean realizarJogada(int linha, int coluna) {
        if (linha > 0 && coluna > 0) {
            if (linha <= tabuleiro.length && coluna <= tabuleiro[linha-1].length) {
                if (tabuleiro[linha-1][coluna-1].equals(" ")) {
                    tabuleiro[linha-1][coluna-1] = sinal;
                    return true;
                }
                return false;
            }
            return false;
        }

        return false;
    }

    void trocarSinal() {
        if (sinal.equals("X")) {
            sinal = "O";
            rodada++;
        } else {
            sinal = "X";
            rodada++;
        }
    }

    boolean vitoriaLinha() {
        for (int i = 0; i < tabuleiro.length; i++) {
            if (!tabuleiro[i][0].equals(" ") && tabuleiro[i][0].equals(tabuleiro[i][1])
                    && tabuleiro[i][1].equals(tabuleiro[i][2])) {
                return true;
            }
        }

        return false;
    }

    boolean vitoriaColuna() {
        for (int i = 0; i < tabuleiro[0].length; i++) {
            if (!tabuleiro[0][i].equals(" ") && tabuleiro[0][i].equals(tabuleiro[1][i])
                    && tabuleiro[1][i].equals(tabuleiro[2][i])) {
                return true;
            }
        }

        return false;
    }

    boolean vitoriaDiagonal() {
        if (!tabuleiro[0][0].equals(" ") && tabuleiro[0][0].equals(tabuleiro[1][1])
                && tabuleiro[1][1].equals(tabuleiro[2][2])) {
            return true;
        }

        if (!tabuleiro[0][2].equals(" ") && tabuleiro[0][2].equals(tabuleiro[1][1])
                && tabuleiro[1][1].equals(tabuleiro[2][0])) {
            return true;
        }

        return false;
    }

    boolean verificarVitoria() {
        if (vitoriaLinha() || vitoriaColuna() || vitoriaDiagonal()) {
            return true;
        }

        return false;
    }

    boolean verificarEmpate() {
        if (!verificarVitoria() && rodada == 9) {
            System.out.println("Empate!");
            return true;
        }
        
        return false;
    }
    
    boolean finalizarPartida() {
        if (verificarVitoria() || verificarEmpate()) {
            finalizado = true;
            return finalizado;
        }
        
        finalizado = false;
        return finalizado;
    }
}
