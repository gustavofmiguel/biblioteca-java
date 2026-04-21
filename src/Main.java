public class Main {
    public static void main(String[] args) {

        // Criando livros físicos — instâncias diretas de Livro
        Livro livro1 = new Livro("Harry Potter - A Pedre Filosofal", "J.K. Rowling");
        Livro livro2 = new Livro("A Volta dos que Não Foram", "Eu");

        // Criando Ebooks — herdam de Livro, terceiro parâmetro é o tamanho do arquivo em MB
        Ebook ebook1 = new Ebook("Java para Iniciantes", "Herbert Schildt", 25.34);
        Ebook ebook2 = new Ebook("Hábitos Atômicos", "James Clear", 35.25);

        // Criando Revistas — herdam de Livro, terceiro parâmetro é o número da edição
        Revista revista1 = new Revista("Veja", "Abril", 10);
        Revista revista2 = new Revista("Exame", "Autor exame", 26);
        
        // Criando usuários — parâmetros: nome, idade, espaço em MB, livro inicial
        // "meuLivro" é do tipo Livro, mas aceita Ebook e Revista com polimorfismo
        User gustavo = new User("Gustavo", 25, 35, livro2);
        User paulo = new User("Paulo",18 ,45, livro1);
        User saulo = new User("Saulo", 22,20, ebook2);

        // pegarLivro() chama emprestar() e atribui o livro ao usuário.
        // Como livro1 é um Livro físico, executa o emprestar() de Livro.
        paulo.pegarLivro(livro1);

        // testando getters e setters
        System.out.println("\n --- Testando Getters e Setter --- ");
        System.out.println("O usuário " + gustavo.getNome() +" tem o livro " + gustavo.getMeuLivro().getTitulo());
        
        // setMeuLivro() troca o livro atual do usuário por um Ebook — polimorfismo
        gustavo.setMeuLivro(ebook1);
        System.out.println("Agora usando o setter ele tem " + gustavo.getMeuLivro().getTitulo());

        System.out.println("\n --- Testabdo Livro Físico --- ");
        System.out.println("Aplicando o método emprestar ");
        
        // livro1 já foi emprestado por paulo.pegarLivro() acima,
        // então aqui o status já é true — a mensagem será "Já foi emprestado"
        livro1.emprestar();
        System.out.println("Aplicando o método devolver ");
        livro1.devolver(); // devolve e muda status de volta para false

        System.out.println("\n --- Testando Ebook --- ");

        // emprestar() de Ebook sempre retorna disponível — sem estoque físico
        ebook1.emprestar();


        // baixar() verifica se o espaço do usuário (avaliableSize) comporta o arquivo
        System.out.println("O usuário " + gustavo.getNome() + " Tem o armazenamento disponivel de: " + gustavo.getAvaliableSize() + "MB");
        ebook1.baixar(gustavo.getAvaliableSize());
        System.out.println("O usuário " + paulo.getNome() + " Tem o armazenamento disponivel de: " + paulo.getAvaliableSize() + "MB");
        ebook2.baixar(paulo.getAvaliableSize());
        System.out.println("O usuário " + saulo.getNome() + " Tem o armazenamento disponivel de: " + saulo.getAvaliableSize() + "MB");
        ebook2.baixar(saulo.getAvaliableSize());
        
        System.out.println("\n -- Testabdo Revistas -- ");
        // emprestar() de Revista informa que só pode ser lida dentro da biblioteca
        revista1.emprestar();
    }
}
