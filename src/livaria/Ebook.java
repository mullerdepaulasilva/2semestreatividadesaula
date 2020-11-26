package livaria;

public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do Ebook");
        System.out.println("Nome:" + getNome());
        System.out.println("Descricao" + getDescricao());
        System.out.println("Valor" + getValor());
        System.out.println("WaterMark"+ getWaterMark());
        getAutor().mostrarDetalhes();
    }
}
