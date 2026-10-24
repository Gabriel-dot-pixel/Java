package listaorientacaoobjeto;

public class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] disciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean avaliarAprovado(int pos) {
        if (calcularMedia(pos) >= 7.0) {
            return true;
        }
        
        return false;
    }
    
    double calcularMedia(int pos) {
        double soma = 0;
        double media;
        for (int i = 0; i < notasDisciplinas[pos].length; i++) {
            soma += notasDisciplinas[pos][i];
        }
       media = soma / 4;
            
        return media;
    }
}
