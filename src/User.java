// Representa um usuário da biblioteca.
// O atributo "meuLivro" é do tipo Livro, mas pode receber qualquer subtipo

public class User {
    private String nome;
    private int idade;
    private double avaliableSize; // espaço disponível em MB, usado para baixar Ebooks
    private Livro meuLivro;

    public User (String nome,int idade, double avaliableSize, Livro meuLivro){
        this.nome = nome;
        this.idade = idade;
        this.avaliableSize = avaliableSize;
        this.meuLivro = meuLivro;
    }

    // Getters expõem os atributos privados de forma controlada
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public double getAvaliableSize(){
        return avaliableSize;
    }
    public Livro getMeuLivro(){
        return meuLivro;
    }
    
    // Setter permite trocar o livro do usuário após a criação do objeto
    public void setMeuLivro(Livro meuLivro){
        this.meuLivro = meuLivro;
    }


    // O Java decide em tempo de execução qual versão de emprestar() chamar,
    // dependendo se o objeto passado é um Livro, Ebook ou Revista.
    public Livro pegarLivro(Livro livro){
        livro.emprestar();
        setMeuLivro(livro);
        return livro;
    }
}

