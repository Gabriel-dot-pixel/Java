package listarelacionamentos;

import java.util.Scanner;

public class TesteCurso {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Curso curso = new Curso();
        Professor professor = new Professor();
        Aluno[] alunos = new Aluno[5];
        
        System.out.println("------ Dados do Curso ------");
        System.out.print("Digite o nome do curso: ");
        String nomeCurso = ler.nextLine();
        curso.setNome(nomeCurso);
        
        System.out.print("Digite o horario do curso: ");
        String horario = ler.nextLine();
        curso.setHorario(horario);
        
        System.out.println("------ Dados do Professor ------");
        
        System.out.print("Digite o nome do professor do curso: ");
        String nomeProfessor = ler.nextLine();
        professor.setNome(nomeProfessor);
        
        System.out.print("Digite o departamento do professor: ");
        String departamento = ler.nextLine();
        professor.setDepartamento(departamento);
        
        System.out.print("Digite o e-mail do professor: ");
        String email = ler.nextLine();
        professor.setEmail(email);
        
        curso.setProfessor(professor);
        
        System.out.println("------ Dados dos Alunos ------");
        
        for (int i=0; i<alunos.length; i++) {
            Aluno a = new Aluno();
            double[] notas = new double[4];
            
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            String nomeAluno = ler.nextLine();
            a.setNome(nomeAluno);
            
            System.out.print("Digite a matricula do aluno " + (i+1) + ": ");
            String matricula = ler.nextLine();
            a.setMatricula(matricula);
            
            for (int j=0; j<notas.length; j++) {
                System.out.print("Digite a nota " + (j+1) + " do aluno " + (i+1) + ": ");
                notas[j] = ler.nextDouble();
            }
            
            ler.nextLine();
            
            a.setNotas(notas);
            alunos[i] = a;
        }
        
        curso.setAlunos(alunos);
        
        System.out.println(curso.exibirInfo());
    }
}
