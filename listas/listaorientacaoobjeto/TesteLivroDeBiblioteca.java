package listaorientacaoobjeto;

import java.util.Date;

public class TesteLivroDeBiblioteca {

    public static void main(String[] args) {
        
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        
        livro.titulo = "Senhor dos Aneis";
        livro.autor = "J.R.R. Tolkien";
        livro.anoLancamento = 1954;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.nomeDoDevedor = "Gabriel";
        
        System.out.println("Titulo do livro: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de lancamento: " + livro.anoLancamento);
    }
}
