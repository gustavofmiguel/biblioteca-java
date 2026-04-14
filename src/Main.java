public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Harry Potter - A Pedre Filosofal", "J.K. Rowling");
        Livro livro2 = new Livro("A Volta dos que Não Foram", "Eu");

        Ebook ebook1 = new Ebook("Java para Iniciantes", "Alguém", 25.34);
        Ebook ebook2 = new Ebook("Hábitos Atômicos","James Clear",35.25);

        Revista revista1 = new Revista("Veja", "Abril", 10);
        Revista revista2 = new Revista("Exame", "Autor exame", 26);


        User gustavo = new User("Gustavo", 25, 35, livro2);
        User paulo = new User("Paulo",18 ,45, livro1);
        User saulo = new User("Saulo", 22,20, ebook2);

        paulo.pegarLivro(livro1);

        // testando os metodos getters e setters
        System.out.println("\n --- Testando Getters e Setter --- ");
        System.out.println("O usuário " + gustavo.getNome() +" tem o livro " + gustavo.getMeuLivro().getTitulo());
        gustavo.setMeuLivro(ebook1);
        System.out.println("Agora usando o setter ele tem " + gustavo.getMeuLivro().getTitulo());

        System.out.println("\n --- Testabdo Livro Físico --- ");
        System.out.println("Aplicando o método emprestar ");
        livro1.emprestar();
        System.out.println("Aplicando o método devolver ");
        livro1.devolver();

        System.out.println("\n --- Testando Ebook --- ");
        ebook1.emprestar();
        System.out.println("O usuário " + gustavo.getNome() + " Tem o armazenamento disponivel de: " + gustavo.getAvaliableSize() + "MB");
        ebook1.baixar(gustavo.getAvaliableSize());
        System.out.println("O usuário " + paulo.getNome() + " Tem o armazenamento disponivel de: " + paulo.getAvaliableSize() + "MB");
        ebook2.baixar(paulo.getAvaliableSize());
        System.out.println("O usuário " + saulo.getNome() + " Tem o armazenamento disponivel de: " + saulo.getAvaliableSize() + "MB");
        ebook2.baixar(saulo.getAvaliableSize());

        System.out.println("\n -- Testabdo Revistas -- ");
        revista1.emprestar();
    }
}