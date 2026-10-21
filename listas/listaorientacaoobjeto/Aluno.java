package listaorientacaoobjeto;

public class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] disciplinas =  new String[3];
    double[][] notasDisciplinas = new double[3][4];
    
    void receberNotas(double nota) {
        for (int i=0; i<notasDisciplinas.length; i++) {
            for (int j=0; j<notasDisciplinas[i].length; j++) {
                notasDisciplinas[i][j] = nota;
            }
        }
    }
}
