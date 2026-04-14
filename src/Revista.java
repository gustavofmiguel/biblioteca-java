public class Revista extends Livro {
    public int edicao;

    public Revista(String titulo, String autor, int edicao) {
        super(titulo, autor);
        this.edicao = edicao;
    }

    @Override
    public void emprestar() {
        System.out.println("A revista: " + getTitulo() + " (Edição: " + edicao + ") " + "Está somente disponivel dentro da biblioteca");
    }

    private int getEdicao() {
        return edicao;
    }
}
