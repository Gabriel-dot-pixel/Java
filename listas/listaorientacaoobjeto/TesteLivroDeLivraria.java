package listaorientacaoobjeto;

public class TesteLivroDeLivraria {

    public static void main(String[] args) {
        
        LivroDeLivraria livro = new LivroDeLivraria();
        
        livro.titulo = "Senhor dos Aneis";
        livro.autor = "J.R.R. Tolkien";
        livro.anoLancamento = 1954;
        livro.preco = 45.10;
        
        System.out.println("Titulo do livro: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de lancamento: " + livro.anoLancamento);
        System.out.println("Preco: R$" + livro.preco);
    }
}
