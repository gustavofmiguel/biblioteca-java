public class Livro {
    private String titulo;
    private String autor;
    private boolean status;

    public Livro(String titulo, String autor) {   // pode ser acessado de qualquer lugar do programa
        this.titulo = titulo;
        this.autor = autor;  // lista de parâmetros do construtor
        this.status = false;
    }

    // Getters: métodos públicos para acessar atributos privados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isStatus() {
        return status;
    }

    // Implementação padrão de emprestar().
    public void emprestar() {
        if (!status) {
            status = true;
            System.out.println("O livro " + titulo + " Foi emprestado.");
        } else {
            System.out.println("Desculpe, o livro  " + titulo + " Já foi emprestado.");
        }
    }
    // Implementação padrão de devolver().
    public void devolver() {
        if (status) {
            status = false;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + titulo + "' Já está na prateleira");
        }
    }
}

