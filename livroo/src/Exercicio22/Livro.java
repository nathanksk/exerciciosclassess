package Exercicio22;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    // Métodos acessores (getters)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    // Método para verificar se o livro pertence a um determinado gênero
    public boolean pertenceAoGenero(String generoDesejado) {
        return this.genero.equalsIgnoreCase(generoDesejado);
    }

    // Método para exibir informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
    }
}