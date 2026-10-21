package listaorientacaoobjeto;

public class TesteAluno {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.receberNotas(5);
        
        for (int i=0; i<aluno.notasDisciplinas.length; i++) {
            for (int j=0; j<aluno.notasDisciplinas[i].length; j++) {
                System.out.println(aluno.notasDisciplinas[i][j]);
            }
        }
    }
}
