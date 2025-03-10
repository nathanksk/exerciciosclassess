

package exercicio22;

public class Exercicio22 {

    public static void main(String[] args) {
        // TODO code application logic here
        Livro livro1 = new Livro("harry potter", "J. K. Rowling", 1997, "Fantasia");
        livro1.exibirInformacoes();
        
        // Verificar se o livro pertence ao gênero "Fantasia"
        if (livro1.pertenceAoGenero("Fantasia")) {
            System.out.println("O livro pertence ao gênero Fantasia.");
        } else {
            System.out.println("O livro não pertence ao gênero Fantasia.");
        }
    }
}