package exercicio33;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor que inicializa nome e preco, e define quantidade como 0
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;  // Definindo quantidade inicial como 0
    }

    // Métodos acessores (getters)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método para aumentar a quantidade
    public void aumentarQuantidade(int quantidadeAumentar) {
        if (quantidadeAumentar > 0) {
            this.quantidade += quantidadeAumentar;
        } else {
            System.out.println("A quantidade a aumentar deve ser positiva.");
        }
    }

    // Método para diminuir a quantidade
    public void diminuirQuantidade(int quantidadeDiminuir) {
        if (quantidadeDiminuir > 0 && quantidadeDiminuir <= quantidade) {
            this.quantidade -= quantidadeDiminuir;
        } else {
            System.out.println("Quantidade inválida para diminuir.");
        }
    }

    // Método para exibir informações do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}