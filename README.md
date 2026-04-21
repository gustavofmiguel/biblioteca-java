# 📚 Sistema de Biblioteca Java — Orientação Objetos

Projeto de estudo desenvolvido com o objetivo de praticar os principais pilares da **Orientação a Objetos** em Java: herança, encapsulamento, polimorfismo e sobrescrita de métodos.

---

## Conceitos praticados

| Conceito | Onde aparece |
|---|---|
| **Herança** | `Ebook` e `Revista` estendem `Livro` |
| **Polimorfismo** | `User.pegarLivro(Livro)` aceita qualquer subtipo de `Livro` |
| **Encapsulamento** | Atributos `private` com getters/setters em todas as classes |
| **Sobrescrita** | `@Override` em `emprestar()` e `devolver()` nos subtipos |

---

## Estrutura do projeto

```
src/
├── Livro.java      # Classe base — livro físico
├── Ebook.java      # Subtipo: livro digital com tamanho em MB
├── Revista.java    # Subtipo: revista, consultada só na biblioteca
├── User.java       # Usuário da biblioteca
└── Main.java       # Ponto de entrada — testes e demonstrações
```

---

## Classes

### `Livro` — classe base

Base comum para todos os itens do acervo. `Ebook` e `Revista` herdam seus atributos e métodos.

| Atributo | Tipo | Descrição |
|---|---|---|
| `titulo` | `String` | Título do item |
| `autor` | `String` | Nome do autor |
| `status` | `boolean` | `false` = disponível, `true` = emprestado |

| Método | Descrição |
|---|---|
| `emprestar()` | Empresta o item se estiver disponível |
| `devolver()` | Devolve o item se estiver emprestado |
| `getTitulo()` | Retorna o título |
| `getAutor()` | Retorna o autor |
| `isStatus()` | Retorna o status atual |

---

### `Ebook` — extends Livro

Representa um livro digital. Sobrescreve `emprestar()` pois está sempre disponível, e adiciona o método `baixar()`.

| Atributo | Tipo | Descrição |
|---|---|---|
| `tamanhoArquivo` | `double` | Tamanho do arquivo em MB |

| Método | Descrição |
|---|---|
| `baixar(double size)` | Baixa o ebook se houver espaço suficiente |
| `emprestar()` | Sempre disponível — sem estoque físico |
| `devolver()` | Confirma devolução digital |

---

### `Revista` — extends Livro

Representa uma revista física. Sobrescreve `emprestar()` pois só pode ser consultada dentro da biblioteca.

| Atributo | Tipo | Descrição |
|---|---|---|
| `edicao` | `int` | Número da edição |

| Método | Descrição |
|---|---|
| `emprestar()` | Informa que a revista é de uso interno |

---

### `User`

Representa um usuário da biblioteca. O atributo `meuLivro` é do tipo `Livro`, mas aceita qualquer subtipo — isso é **polimorfismo**.

| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome do usuário |
| `idade` | `int` | Idade do usuário |
| `avaliableSize` | `double` | Espaço disponível em MB (para Ebooks) |
| `meuLivro` | `Livro` | Item atual do usuário |

| Método | Descrição |
|---|---|
| `pegarLivro(Livro livro)` | Chama `emprestar()` e atribui o item ao usuário |
| `setMeuLivro(Livro livro)` | Troca o item atual do usuário |
| `getMeuLivro()` | Retorna o item atual |
