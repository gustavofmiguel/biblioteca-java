// Ebook herda tudo de Livro (titulo, autor, status, emprestar, devolver).
// "extends Livro" = Ebook É UM Livro, com atributos e comportamentos extras.

public class Ebook extends Livro {
    private double tamanhoAquivo;

    // O construtor recebe os dados do Ebook e repassa titulo/autor para Livro via super()
    public Ebook(String titulo, String autor, double tamanho) {
        super(titulo, autor); // chama o construtor de Livro
        this.tamanhoAquivo = tamanho;
    }

    public double getTamanhoArquivo() {
        return tamanhoAquivo;
    }

    // Verifica se há espaço disponível antes de baixar.
    // "size" é o espaço disponível em MB do usuário.
    public void baixar(double size) {
        if (getTamanhoArquivo() <= size){
            System.out.println("Baixando " + getTitulo() + " (" + tamanhoAquivo + "MB)...");
            System.out.println("Novo armazenamento " + (size - tamanhoAquivo) + "MB");
        } else {
            System.out.println("Armazenamento indisponivel");
        }
    }

    // @Override sobrescreve o emprestar() de Livro.
    // Ebook não tem estoque físico, então está sempre disponível.
    @Override
    public void emprestar() {
        System.out.println("Ebooks estão sempre disponíveis!");
    } 
}
