public class User {
    private String nome;
    private int idade;
    private double avaliableSize;
    private Livro meuLivro;

    public User (String nome,int idade, double avaliableSize, Livro meuLivro){
        this.nome = nome;
        this.idade = idade;
        this.avaliableSize = avaliableSize;
        this.meuLivro = meuLivro;
    }

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
    public void setMeuLivro(Livro meuLivro){
        this.meuLivro = meuLivro;
    }


    public Livro pegarLivro(Livro livro){
        livro.emprestar();
        setMeuLivro(livro);
        return livro;
    }
}

