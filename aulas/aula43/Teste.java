package aula43;

public class Teste {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        double[] notas = {10, 9, 8, 7};
        double[] notas2 = {9, 8, 6, 7};
        
        aluno.setCurso("BCC");
        aluno.setNotas(notas);
        
        System.out.println(aluno);
        
        String s1 = "acatatu";
        String s2 = "acatatU";
        
        System.out.println(s1.equalsIgnoreCase(s2));
        
        aluno2.setCurso("BCC");
        aluno2.setNotas(notas2);
        
        System.out.println(aluno.equals(aluno2));
    }
}
