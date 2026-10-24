package listaorientacaoobjeto;

public class JogoDaVelha {

    private String[][] tabuleiro = new String[3][3];
    private String sinal;
    private int rodada;
    private boolean finalizado;

    public JogoDaVelha() {
        this.sinal = "X";
        this.rodada = 0;
        this.finalizado = false;
    }

    public JogoDaVelha(String sinal, int rodada, boolean finalizado) {
        this.sinal = sinal;
        this.rodada = rodada;
        this.finalizado = finalizado;
    }

    public void montarTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }
    }

    public void exibirTabuleiro() {
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

    public boolean realizarJogada(int linha, int coluna) {
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

    public void trocarSinal() {
        if (sinal.equals("X")) {
            setSinal("O");
            rodada++;
        } else {
            setSinal("X");
            rodada++;
        }
    }

    public boolean vitoriaLinha() {
        for (int i = 0; i < tabuleiro.length; i++) {
            if (!tabuleiro[i][0].equals(" ") && tabuleiro[i][0].equals(tabuleiro[i][1])
                    && tabuleiro[i][1].equals(tabuleiro[i][2])) {
                return true;
            }
        }

        return false;
    }

    public boolean vitoriaColuna() {
        for (int i = 0; i < tabuleiro[0].length; i++) {
            if (!tabuleiro[0][i].equals(" ") && tabuleiro[0][i].equals(tabuleiro[1][i])
                    && tabuleiro[1][i].equals(tabuleiro[2][i])) {
                return true;
            }
        }

        return false;
    }

    public boolean vitoriaDiagonal() {
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

    public boolean verificarVitoria() {
        if (vitoriaLinha() || vitoriaColuna() || vitoriaDiagonal()) {
            return true;
        }

        return false;
    }

    public boolean verificarEmpate() {
        if (!verificarVitoria() && rodada == 9) {
            System.out.println("Empate!");
            return true;
        }
        
        return false;
    }
    
    public boolean finalizarPartida() {
        if (verificarVitoria() || verificarEmpate()) {
            setFinalizado(true);
            return finalizado;
        }
        
        setFinalizado(false);
        return finalizado;
    }

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}
