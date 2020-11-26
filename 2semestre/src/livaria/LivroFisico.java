package livaria;

public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Mostrem detalhes do Livro Fisico");
        System.out.println("Id:"+ getId());
        System.out.println("Nome:"+ getNome());
        System.out.println("Descricao"+ getDescricao());
        System.out.println("Valor:"+ getValor());
        getAutor().mostrarDetalhes();
    }
}
