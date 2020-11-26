package livaria;

public class RegistroDeVendas {

    public static void main(String[] args ){

        Autor autor = new Autor();
        autor.setNome("Rodrigo");

        LivroFisico fisico= new LivroFisico(autor);
        fisico.setNome("Aprendendo Java");
        fisico.setValor(59.98);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Aprendendo Java Online");
        ebook.setValor(29.09);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

    }
}
