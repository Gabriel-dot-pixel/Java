package aula47;

public class Excecao {

    public static void main(String[] args) {
        
        try{
            int[] vetor = new int[4];

            System.out.println("Antes da Exception");

            vetor[4] = 1;

            System.out.println("Esse texto nao sera impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Excecao ao tentar acessar uma posicao do vetor que nao existe");
        }
        
        System.out.println("Esse texto sera impresso apos a excecao");
    }
}
