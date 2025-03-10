classe principal

package exercicio33;

public class Exercicio33 {

    public static void main(String[] args) {
        // TODO code application logic here
        Produto produto1 = new Produto("bermuda", 29.90);

        produto1.exibirInformacoes();  // Exibe informações iniciais (quantidade = 0)

        // Aumentando a quantidade
        produto1.aumentarQuantidade(10);
        produto1.exibirInformacoes();  // Exibe informações após aumento de quantidade

        // Diminuindo a quantidade
        produto1.diminuirQuantidade(3);
        produto1.exibirInformacoes();  // Exibe informações após diminuição de quantidade
    }

    }