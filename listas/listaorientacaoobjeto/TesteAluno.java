package listaorientacaoobjeto;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        
        aluno.lerAluno();

        aluno.exibirInfo();

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            if (aluno.avaliarAprovado(i)) {
                System.out.println("Voce esta aprovado em " + aluno.getDisciplinas()[i]);
            } else {
                System.out.println("Voce esta reprovado em " + aluno.getDisciplinas()[i]);
            }
        }
    }
}
