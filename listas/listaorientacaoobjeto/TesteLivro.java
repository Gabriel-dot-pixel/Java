package listaorientacaoobjeto;

public class TesteLivro {

    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.titulo = "Senhor dos Aneis";
        livro.autor = "J.R.R. Tolkien";
        livro.anoLancamento = 1954;
        
        System.out.println("Titulo do livro: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de lancamento: " + livro.anoLancamento);
        
    }
}
